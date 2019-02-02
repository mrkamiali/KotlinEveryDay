package com.realmexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import com.realmexample.adapters.ProjectsRecyclerAdapter
import com.realmexample.model.Project
import io.realm.Realm
import io.realm.Sort
import io.realm.SyncUser
import java.util.*

class ProjectActivity : AppCompatActivity() {
    private var realm: Realm? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_task, null)
            (dialogView.findViewById(R.id.task) as EditText).setHint(R.string.project_description)
            val taskText = dialogView.findViewById<EditText>(R.id.task)
            AlertDialog.Builder(this@ProjectActivity)
                .setTitle("Add a new project")
                .setView(dialogView)
                .setPositiveButton("Add") { dialog, which ->
                    realm!!.executeTransactionAsync { realm ->
                        val userId = SyncUser.current().identity
                        val name = taskText.getText().toString()

                        val project = Project()
                        project.id = UUID.randomUUID().toString()
                        project.owner = userId
                        project.name = name
                        project.timestamp = Date()
                        realm.insert(project)
                    }
                }
                .setNegativeButton("Cancel", null)
                .create()
                .show()
        }

        // Create a  subscription that only download the  users projects from the server.
        realm = Realm.getDefaultInstance()
        val projects = realm!!
            .where(Project::class.java!!)
            .equalTo("owner", SyncUser.current().identity)
            .sort("timestamp", Sort.DESCENDING)
            .findAllAsync()

        val itemsRecyclerAdapter = ProjectsRecyclerAdapter(this, projects)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        recyclerView.setAdapter(itemsRecyclerAdapter)
    }

    override fun onDestroy() {
        super.onDestroy()
        realm!!.close()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_items, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_logout) {
            val syncUser = SyncUser.current()
            if (syncUser != null) {
                syncUser.logOut()
                val intent = Intent(this, MainActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)
            }
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}

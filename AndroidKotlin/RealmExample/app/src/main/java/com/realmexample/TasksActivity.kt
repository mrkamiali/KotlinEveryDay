package com.realmexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import com.realmexample.adapters.TasksRecyclerAdapter
import com.realmexample.model.Item
import com.realmexample.model.Project
import io.realm.Realm
import io.realm.Sort
import io.realm.SyncUser

class TasksActivity : AppCompatActivity() {

    companion object {
        val INTENT_EXTRA_PROJECT_ID = "TasksActivity.projectId"
    }

    private var realm: Realm? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)


        setSupportActionBar(findViewById(R.id.toolbar))

        val projectId = intent.getStringExtra(INTENT_EXTRA_PROJECT_ID)

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_task, null)
            val taskText = dialogView.findViewById<EditText>(R.id.task)
            AlertDialog.Builder(this@TasksActivity)
                .setTitle("Add a new task")
                .setMessage("What do you want to do next?")
                .setView(dialogView)
                .setPositiveButton("Add") { dialog, which ->
                    realm!!.executeTransactionAsync { realm ->
                        var item = Item()
                        item.body = (taskText.getText().toString())
                        realm!!.where(Project::class.java!!).equalTo("projectId", projectId).findFirst()!!.items!!.add(
                            item
                        )
                    }
                }
                .setNegativeButton("Cancel", null)
                .create()
                .show()
        }

        realm = Realm.getDefaultInstance()
        val project = realm!!.where(Project::class.java!!).equalTo("projectId", projectId)
            .findFirst()

        setTitle(project!!.name)
        val itemsRecyclerAdapter = TasksRecyclerAdapter(
            project!!.items!!.sort("timestamp", Sort.ASCENDING)
        )
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        recyclerView.setAdapter(itemsRecyclerAdapter)

        val simpleItemTouchCallback =
            object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {

                override fun onMove(
                    recyclerView: RecyclerView,
                    viewHolder: RecyclerView.ViewHolder,
                    target: RecyclerView.ViewHolder
                ): Boolean {
                    return false
                }

                override fun onSwiped(viewHolder: RecyclerView.ViewHolder, swipeDir: Int) {
                    val position = viewHolder.adapterPosition
                    val id = itemsRecyclerAdapter.getItem(position)!!.itemId
                    realm!!.executeTransactionAsync { realm ->
                        val item = realm.where(Item::class.java!!).equalTo("itemId", id).findFirst()
                        if (item != null) {
                            item!!.deleteFromRealm()
                        }
                    }
                }
            }

        val itemTouchHelper = ItemTouchHelper(simpleItemTouchCallback)
        itemTouchHelper.attachToRecyclerView(recyclerView)
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

package com.kotlinapp.kotlintodo

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var listarray: ArrayList<Model> = ArrayList()
    private lateinit var customadapter: CustomAdaper

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val listView = findViewById<View>(R.id.listView) as ListView
        customadapter = CustomAdaper(listarray, this)
        listView.adapter = CustomAdaper(listarray, this)

        fab.setOnClickListener { view ->
            val builder = AlertDialog.Builder(this)
            val layoutInflater = this.layoutInflater
            val dialogView = layoutInflater.inflate(R.layout.dialogue_custom_view, null)

            val ageView = dialogView.findViewById<View>(R.id.age_view) as EditText
            val nameView = dialogView.findViewById<View>(R.id.name_view) as EditText
            builder.setView(dialogView)

            builder.setTitle("Custom dialog")
            builder.setMessage("Enter Name Below")
                    .setPositiveButton("OK", { dialog, which ->
                        listarray.add(Model(nameView.text.toString(), ageView.text.toString().toInt()))
                        customadapter.notifyDataSetChanged()
                    }).setNegativeButton("Cancel", null)

            builder.create().show()
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }


}

package com.realmexample.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.realmexample.TasksActivity
import com.realmexample.model.Project
import io.realm.OrderedRealmCollection
import io.realm.RealmRecyclerViewAdapter

class ProjectsRecyclerAdapter(ctx: Context? , data:OrderedRealmCollection<Project> )
    : RealmRecyclerViewAdapter<Project,ProjectsRecyclerAdapter.MyViewHolder>(data,true) {
    private val context: Context? = ctx


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_1, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val project = getItem(position)
        if (project != null) {
            holder.textView.setText(project!!.name)
            holder.textView.setOnClickListener { v ->
                val intent = Intent(context, TasksActivity::class.java)
                intent.putExtra(TasksActivity.INTENT_EXTRA_PROJECT_ID, project!!.id)
                context!!.startActivity(intent)
            }
        }
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView

        init {
            textView = itemView.findViewById(android.R.id.text1)
        }
    }
}

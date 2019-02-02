package com.realmexample.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import com.realmexample.R
import com.realmexample.model.Item
import io.realm.OrderedRealmCollection
import io.realm.RealmRecyclerViewAdapter

internal class TasksRecyclerAdapter(data: OrderedRealmCollection<Item>) :
    RealmRecyclerViewAdapter<Item, TasksRecyclerAdapter.MyViewHolder>(data,true) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = getItem(position)
        holder.setItem(item)
    }

    internal inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var textView: TextView
        var checkBox: CheckBox
        var item1: Item? = null

        init {
            textView = itemView.findViewById(R.id.body)
            checkBox = itemView.findViewById(R.id.checkbox)
            checkBox.setOnClickListener(this)
        }

        fun setItem(item: Item?) {
            this.item1 = item
            this.textView.setText(item!!.body)
            this.checkBox.isChecked = item!!.isDone!!
        }

        override fun onClick(v: View) {
            val itemId = item1!!.itemId
            val isDone = this.item1!!.isDone
            this.item1!!.getRealm().executeTransactionAsync { realm ->
                val item = realm.where(Item::class.java).equalTo("itemId", itemId).findFirst()
                if (item != null) {
                    item!!.isDone= !isDone!!
                }
            }
        }
    }
}

package com.kotlinapp.kotlintodo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView


open class CustomAdaper(private var list: ArrayList<Model>, private var context: Context) : BaseAdapter() {

    var lisarray = list
    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

        val view = inflater.inflate(R.layout.adapter_custom_view, parent, false) as View
        val itemName = view.findViewById<View>(R.id.name_view) as TextView
        val ageView = view.findViewById<View>(R.id.age_view) as TextView

        val item: Model = lisarray[position]
        itemName.text = item.name
        ageView.text = item.age.toString()

        return view
    }

    override fun getItem(position: Int): Any {

        return lisarray[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return lisarray.size
    }


}

private class ViewHolder(view: View) {
    internal var itemName: TextView
    internal var ageView: TextView

    init {
        itemName = view.findViewById<View>(R.id.name_view) as TextView
        ageView = view.findViewById<View>(R.id.age_view) as TextView
    }
}
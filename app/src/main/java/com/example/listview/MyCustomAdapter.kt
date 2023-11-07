package com.example.listview

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class MyCustomAdapter(val ctx: Context,
                      var ourResource: Int,
                      var Items: ArrayList<Model>) :
    ArrayAdapter<Model>(ctx, ourResource, Items)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)
    }

}
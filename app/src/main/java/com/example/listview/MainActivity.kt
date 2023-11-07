package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView1 = findViewById<ListView>(R.id.idListView1)

        var stuff = arrayOf("Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 7",)

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            stuff)
        listView1.adapter = arrayAdapter


        listView1.setOnItemClickListener{ parent, view, position, id ->
            Toast.makeText(this, "Selected: " + stuff[position], Toast.LENGTH_LONG).show()
        }
    }
}
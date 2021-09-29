package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var btn:Button
    lateinit var rv:RecyclerView
    lateinit var et:EditText

    lateinit var al:ArrayList<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        al = ArrayList()

        btn = findViewById(R.id.btn)
        rv = findViewById(R.id.rv)
        et = findViewById(R.id.et)

        btn.setOnClickListener {
            al.add(et.text.toString())
            rv.adapter?.notifyDataSetChanged()
            et.text.clear()
            et.clearFocus()


        }

        rv.adapter = MyAdapter(al)

        rv.layoutManager = LinearLayoutManager(this)


    }
}
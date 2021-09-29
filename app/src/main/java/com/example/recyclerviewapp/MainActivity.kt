package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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
            var txt = et.text.toString()
            if(txt == ""){
                Toast.makeText(applicationContext,"Type a text",Toast.LENGTH_SHORT).show()

            }else{
                al.add(txt)
            }
            rv.adapter?.notifyDataSetChanged()
            et.text.clear()
            et.clearFocus()


        }

        rv.adapter = MyAdapter(al)

        rv.layoutManager = LinearLayoutManager(this)


    }
}
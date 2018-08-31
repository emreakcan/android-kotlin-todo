package com.mykotlinproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.widget.LinearLayoutManager



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        todo_recycler.layoutManager = LinearLayoutManager(applicationContext)

        val todoList = ArrayList<String>()

        todoList.add("Test")
        todoList.add("Test")
        todoList.add("Testos")
        todoList.add("Test")
        todoList.add("Testos")
        todoList.add("Test")
        todoList.add("Testos")
        todoList.add("Test")
        todoList.add("Testos")
        todoList.add("Test")
        todoList.add("Testos")
        todoList.add("Test")
        todoList.add("Testos")
        todoList.add("Test")
        todoList.add("Testos")
        todoList.add("Testos")

        todo_recycler.adapter = TodoAdapter(todoList)


    }
}

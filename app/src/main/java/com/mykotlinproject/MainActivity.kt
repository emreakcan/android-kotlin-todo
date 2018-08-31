package com.mykotlinproject

import android.app.Dialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val todoList = ArrayList<String>()
    private var todoAdapter = TodoAdapter(null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        todo_recycler.layoutManager = LinearLayoutManager(applicationContext)


        todoList.add("Test")
        todoList.add("Test2")

        todoAdapter = TodoAdapter(todoList)

        todo_recycler.adapter = todoAdapter

        initFloatingButton()
    }

    private fun initFloatingButton() {
        floatingActionButton5.setOnClickListener {
            showMyCustomAlertDialog()
        }
    }

    private fun showMyCustomAlertDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.add_dialog)

        val todoEdt = dialog.findViewById(R.id.todoEdt) as EditText
        val addBtn = dialog.findViewById(R.id.add) as Button

        addBtn.setOnClickListener {
            addTodo(todoEdt.text.toString())
            dialog.dismiss()
        }
        dialog.show()
    }

    private fun addTodo(todoName: String){
       todoAdapter.addTodo(todoName)
    }

}

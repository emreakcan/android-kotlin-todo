package com.mykotlinproject

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class TodoAdapter internal constructor(internal var todoList: ArrayList<String>?) : RecyclerView.Adapter<TodoHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.todo_recyclerview_cell, parent, false)
        return TodoHolder(view)
    }

    override fun onBindViewHolder(holder: TodoHolder, position: Int) {
        holder.bind(todoList!![position], this)
    }

    fun delete(position: Int) {
        try {
            todoList?.removeAt(position)
            notifyItemRemoved(position)
        } catch (e: Exception) {
        }
    }

    override fun getItemCount(): Int {
        return todoList?.size!!
    }

    fun addTodo(string: String){
        todoList?.add(string)
        notifyDataSetChanged()
    }

}

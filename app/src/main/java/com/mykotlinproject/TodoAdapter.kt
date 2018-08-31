package com.mykotlinproject

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.todo_recyclerview_cell.view.*

internal class TodoAdapter internal constructor(internal var todoList: ArrayList<String>) : RecyclerView.Adapter<TodoAdapter.TodoHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.todo_recyclerview_cell, parent, false)
        return TodoHolder(view)
    }

    override fun onBindViewHolder(holder: TodoHolder, position: Int) {
        holder.bind(todoList[position])
    }

    fun delete(position: Int){
        todoList.removeAt(position)
        notifyItemRemoved(position)
    }


    override fun getItemCount(): Int {
        return todoList.size
    }


    internal inner class TodoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var todoText = itemView.todoText
        var todoButton = itemView.todoButton

        fun bind(todoString: String){

            todoText.text = todoString

            todoButton.setOnClickListener {
                delete(adapterPosition)
            }
        }

    }

}

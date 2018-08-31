package com.mykotlinproject

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.todo_recyclerview_cell.view.*

class TodoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var todoText = itemView.todoText
    var todoButton = itemView.todoButton

    fun bind(todoString: String, todoAdapter: TodoAdapter){

        todoText.text = todoString

        todoButton.setOnClickListener {
            todoAdapter.delete(adapterPosition)
        }
    }

}
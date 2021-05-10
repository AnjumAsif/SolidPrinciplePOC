package com.example.solidprincipledemo.s.bad

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.solidprincipledemo.R
import java.lang.StringBuilder


class TestAdapterB(val mCtx: Context) : RecyclerView.Adapter<TestAdapterB.TaskAdapterBHolder>() {
    var arr = arrayOf("ABC", "BCD", "CDE")
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): TaskAdapterBHolder {
        val view: View = LayoutInflater.from(mCtx).inflate(R.layout.list_item, parent, false)
        return TaskAdapterBHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: TaskAdapterBHolder, position: Int) {
        //SRP violation, onBindViewHolder has only the responsibility to display data
        // & not make data formatting operations
        val strBuilder = StringBuilder()
        for (gens: String in arr) {
            strBuilder.append(gens).append(",")
        }
        holder.genereations.text = strBuilder.toString()

    }


    inner class TaskAdapterBHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val genereations = itemView.findViewById<TextView>(R.id.textView_genere)!!
    }
}
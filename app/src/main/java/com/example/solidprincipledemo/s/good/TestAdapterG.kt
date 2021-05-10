package com.example.solidprincipledemo.s.good

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.solidprincipledemo.R
import com.example.solidprincipledemo.utils.AppUtils


class TestAdapterG(val mCtx: Context) : RecyclerView.Adapter<TestAdapterG.TaskAdapterGHolder>() {

    var arr:String = arrayOf("A", "B", "C").toString()
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): TaskAdapterGHolder {
        val view: View = LayoutInflater.from(mCtx).inflate(R.layout.list_item, parent, false)
        return TaskAdapterGHolder(view)
    }

    override fun onBindViewHolder(holder: TaskAdapterGHolder, position: Int) {
        //all the logic is moved into util class...now is clean!
        holder.genereations.text = AppUtils.convertIntoCommaSeparated(arr)
    }

    override fun getItemCount(): Int {
        return 10
    }

    inner class TaskAdapterGHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val genereations = itemView.findViewById<TextView>(R.id.textView_genere)!!
    }
}
package com.example.petshelter.PetsHome

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.petshelter.R

class ListItemView(private val data: List<String>) :
    RecyclerView.Adapter<ListItemView.ViewHolder>() {

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.tv_item_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.pets_item_list_view, parent, false)

        return ViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = data[position]
    }

    override fun getItemCount(): Int = data.size
}
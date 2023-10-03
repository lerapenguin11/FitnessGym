package com.example.fitnessgym.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.domoin.entities.Sports
import com.example.fitnessgym.R

class ClassesAdapter() : RecyclerView.Adapter<ClassesAdapter.ClassesViewHolder>(){

    private val classesList = mutableListOf<Sports>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_classes, parent, false)

        return ClassesViewHolder(view)
    }

    override fun getItemCount(): Int = classesList.size

    override fun onBindViewHolder(holder: ClassesViewHolder, position: Int) {
        val classes = classesList[position]
        holder.name.setText(classes.info.name)
        holder.level.setText(classes.info.level)
        holder.energy.setText(classes.info.energy)
        holder.min.setText(classes.info.min)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItem(classesList : List<Sports>){
        this.classesList.clear()
        this.classesList.addAll(classesList)
        notifyDataSetChanged()
    }

    class ClassesViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val name : TextView = view.findViewById(R.id.tv_name_classes)
        val min : TextView = view.findViewById(R.id.tv_min_classes)
        val level : TextView = view.findViewById(R.id.tv_level_classes)
        val energy : TextView = view.findViewById(R.id.tv_energy_classes)
    }
}
package com.example.fitnessgym.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.domoin.entities.Sports
import com.example.fitnessgym.R

class TopAdapter() : RecyclerView.Adapter<TopAdapter.TopViewHolder>(){

    private val topList = mutableListOf<Sports>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_top, parent, false)

        return TopViewHolder(view)
    }

    override fun getItemCount(): Int = topList.size

    override fun onBindViewHolder(holder: TopViewHolder, position: Int) {
        val top = topList[position]
        holder.name.setText(top.info.name)
        holder.kcal.setText(top.info.kcal)
        holder.min.setText(top.info.min)
        Glide.with(holder.itemView)
            .load(top.info.icon)
            .into(holder.icon)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItem(topList : List<Sports>){
        this.topList.clear()
        this.topList.addAll(topList)
        notifyDataSetChanged()
    }

    class TopViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val icon : ImageView = view.findViewById(R.id.icon_top)
        val name : TextView = view.findViewById(R.id.tv_name_top)
        val kcal : TextView = view.findViewById(R.id.tv_top_kcal)
        val min : TextView = view.findViewById(R.id.tv_top_min)
    }
}
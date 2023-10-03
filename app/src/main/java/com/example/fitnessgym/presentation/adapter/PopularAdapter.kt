package com.example.fitnessgym.presentation.adapter

import android.annotation.SuppressLint
import android.graphics.Outline
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewOutlineProvider
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.domoin.entities.Sports
import com.example.fitnessgym.R
import com.example.fitnessgym.presentation.adapter.listener.PopularListener
import com.example.fitnessgym.сustomView.CustomImageView

class PopularAdapter(
    private val listener : PopularListener
) : RecyclerView.Adapter<PopularAdapter.PopularViewHolder>(){

    private val popularList = mutableListOf<Sports>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_popular, parent, false)

        return PopularViewHolder(view)
    }

    override fun getItemCount(): Int = popularList.size

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val popular = popularList[position]
        holder.name.setText(popular.info.name)
        holder.kcal.setText(popular.info.kcal)
        holder.min.setText(popular.info.min)
        listener.setIconPopular(holder.icon)
        Glide.with(holder.itemView)
            .load(popular.info.icon)
            .into(holder.icon)

        holder.icon.clipToOutline = true
        holder.energy.setText(popular.info.energy)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItem(topList : List<Sports>){
        this.popularList.clear()
        this.popularList.addAll(topList)
        notifyDataSetChanged()
    }

    class PopularViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val icon : ImageView = view.findViewById(R.id.ic_popular)
        val name : TextView = view.findViewById(R.id.tv_name_popular)
        val kcal : TextView = view.findViewById(R.id.tv_popular_kcal)
        val min : TextView = view.findViewById(R.id.tv_popular_min)
        val energy : TextView = view.findViewById(R.id.tv_energy_popular)
    }
}
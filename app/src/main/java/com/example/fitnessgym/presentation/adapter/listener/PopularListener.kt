package com.example.fitnessgym.presentation.adapter.listener

import android.widget.ImageView
import com.example.domoin.entities.Sports

interface PopularListener {

    fun setIconPopular(imageView : ImageView)

    fun popularDetails(popular : Sports)
}
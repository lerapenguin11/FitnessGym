package com.example.fitnessgym.data

import com.example.domoin.entities.Sports
import com.example.domoin.entities.SportsInfo
import com.example.fitnessgym.R

object Constants {

    fun getTopData() : MutableList<Sports>{
        var sportsList = mutableListOf<Sports>()

        val sp1 = Sports(0, SportsInfo(R.string.name_top1, R.string.name_top1, R.string.name_top1,
        "https://www.vixyvideo.com/wp-content/uploads/2018/01/header-basic-fit-case.jpg", R.string.name_top1, R.string.name_top1, R.string.name_top1, R.string.name_top1))
        sportsList.add(sp1)

        return sportsList
    }

    fun getPopularData() : MutableList<Sports>{
        var sportsList = mutableListOf<Sports>()

        val sp1 = Sports(1, SportsInfo(R.string.name_top1, R.string.name_top1, R.string.name_top1,
            "https://www.vixyvideo.com/wp-content/uploads/2018/01/header-basic-fit-case.jpg", R.string.name_top1, R.string.name_top1, R.string.name_top1, R.string.name_top1))
        sportsList.add(sp1)

        return sportsList
    }
}
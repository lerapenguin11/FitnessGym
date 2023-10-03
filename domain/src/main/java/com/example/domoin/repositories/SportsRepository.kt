package com.example.domoin.repositories

import com.example.domoin.entities.Sports

interface SportsRepository {

    suspend fun getTop(topList : MutableList<Sports>) : MutableList<Sports>

    suspend fun getPopular(popularList : MutableList<Sports>) : MutableList<Sports>
}
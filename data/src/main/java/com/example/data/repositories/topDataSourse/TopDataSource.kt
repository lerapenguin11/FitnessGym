package com.example.data.repositories.topDataSourse

import com.example.domoin.entities.Sports

interface TopDataSource {

    suspend fun getTopData(topList: MutableList<Sports>) : MutableList<Sports>
}
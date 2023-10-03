package com.example.data.repositories

import com.example.data.repositories.topDataSourse.TopDataSource
import com.example.domoin.entities.Sports
import com.example.domoin.repositories.SportsRepository

class SportsRepositoryImpl(private val dataSource: TopDataSource) : SportsRepository {

    override suspend fun getTop(topList: MutableList<Sports>): MutableList<Sports> {
        return dataSource.getTopData(topList = topList)
    }
}
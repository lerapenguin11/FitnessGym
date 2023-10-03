package com.example.data.repositories

import com.example.data.repositories.popularDataSource.PopularDataSource
import com.example.data.repositories.topDataSourse.TopDataSource
import com.example.domoin.entities.Sports
import com.example.domoin.repositories.SportsRepository

class SportsRepositoryImpl(
    private val topDataSource: TopDataSource,
    private val popularDataSource: PopularDataSource) : SportsRepository {

    override suspend fun getTop(topList: MutableList<Sports>): MutableList<Sports> {
        return topDataSource.getTopData(topList = topList)
    }

    override suspend fun getPopular(popularList: MutableList<Sports>): MutableList<Sports> {
        return popularDataSource.getPopularData(popularList = popularList)
    }
}
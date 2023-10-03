package com.example.data.repositories.popularDataSource

import com.example.domoin.entities.Sports

interface PopularDataSource {

    suspend fun getPopularData(popularList: MutableList<Sports>) : MutableList<Sports>
}
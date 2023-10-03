package com.example.fitnessgym.di

import com.example.data.repositories.SportsRepositoryImpl
import com.example.data.repositories.topDataSourse.TopDataSource
import com.example.data.repositories.topDataSourse.TopDataSourceImpl
import com.example.domoin.repositories.SportsRepository
import org.koin.dsl.module

val dataModule = module {
    single<TopDataSource> { TopDataSourceImpl() }
    single<SportsRepository> { SportsRepositoryImpl(get()) }
}
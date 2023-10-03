package com.example.fitnessgym.di

import com.example.data.repositories.SportsRepositoryImpl
import com.example.data.repositories.classesDataSource.ClassesDataSource
import com.example.data.repositories.classesDataSource.ClassesDataSourceImpl
import com.example.data.repositories.popularDataSource.PopularDataSource
import com.example.data.repositories.popularDataSource.PopularDataSourceImpl
import com.example.data.repositories.topDataSourse.TopDataSource
import com.example.data.repositories.topDataSourse.TopDataSourceImpl
import com.example.domoin.repositories.SportsRepository
import org.koin.dsl.module

val dataModule = module {
    single<TopDataSource> { TopDataSourceImpl() }
    single<PopularDataSource> { PopularDataSourceImpl() }
    single<ClassesDataSource> { ClassesDataSourceImpl() }
    single<SportsRepository> { SportsRepositoryImpl(get(), get(), get()) }
}
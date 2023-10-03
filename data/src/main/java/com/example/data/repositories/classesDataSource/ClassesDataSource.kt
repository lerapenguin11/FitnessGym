package com.example.data.repositories.classesDataSource

import com.example.domoin.entities.Sports

interface ClassesDataSource {

    suspend fun getClassesData(classesList: MutableList<Sports>) : MutableList<Sports>
}
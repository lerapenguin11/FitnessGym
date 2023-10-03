package com.example.data.repositories.classesDataSource

import com.example.domoin.entities.Sports
import com.example.domoin.entities.SportsInfo

class ClassesDataSourceImpl : ClassesDataSource {

    override suspend fun getClassesData(classesList: MutableList<Sports>): MutableList<Sports> {
        val list = mutableListOf<Sports>()

        for (i in classesList){
            val id = i.id
            val name = i.info.name
            val kcal = i.info.kcal
            val min = i.info.min
            val icon = i.info.icon
            val energy = i.info.energy
            val level = i.info.level
            val star = i.info.star
            val desc = i.info.description

            val listLetterModel = Sports(
                id = id, info = SportsInfo(
                    name = name,
                    kcal = kcal,
                    min = min,
                    icon = icon,
                    energy = energy,
                    level = level,
                    star = star,
                    description = desc)
            )

            list.add(listLetterModel)
        }

        return list
    }
}
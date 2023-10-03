package com.example.domoin.usecase

import com.example.domoin.entities.Sports
import com.example.domoin.repositories.SportsRepository

class GetClassesUseCase(private val sportsRepository: SportsRepository) {

    suspend operator fun invoke(classesList: MutableList<Sports>)
            = sportsRepository.getClasses(classesList = classesList)
}
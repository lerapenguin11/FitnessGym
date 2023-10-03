package com.example.domoin.usecase

import com.example.domoin.entities.Sports
import com.example.domoin.repositories.SportsRepository

class GetPopularUseCase(private val sportsRepository: SportsRepository) {

    suspend operator fun invoke(popularList: MutableList<Sports>)
                        = sportsRepository.getPopular(popularList = popularList)
}
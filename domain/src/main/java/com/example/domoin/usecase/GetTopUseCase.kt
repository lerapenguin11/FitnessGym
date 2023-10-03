package com.example.domoin.usecase

import com.example.domoin.repositories.SportsRepository
import com.example.domoin.entities.Sports

class GetTopUseCase(private val sportsRepository: SportsRepository) {

    suspend operator fun invoke(topList: MutableList<Sports>) = sportsRepository.getTop(topList = topList)
}
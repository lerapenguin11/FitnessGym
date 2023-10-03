package com.example.fitnessgym.di

import com.example.domoin.usecase.GetPopularUseCase
import com.example.domoin.usecase.GetTopUseCase
import org.koin.dsl.module

val domainModule = module {

    factory<GetTopUseCase> { GetTopUseCase(
        sportsRepository = get()
    ) }

    factory<GetPopularUseCase> {GetPopularUseCase(
        sportsRepository = get()
    ) }
}


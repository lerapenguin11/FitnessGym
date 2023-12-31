package com.example.fitnessgym.di

import com.example.domoin.usecase.GetClassesUseCase
import com.example.domoin.usecase.GetPopularUseCase
import com.example.domoin.usecase.GetTopUseCase
import com.example.fitnessgym.viewModel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel<HomeViewModel> {
        HomeViewModel(
            getTopUseCase = GetTopUseCase(get()),
            getPopularUseCase = GetPopularUseCase(get()),
            getClassesUseCase = GetClassesUseCase(get())
        )
    }
}
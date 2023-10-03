package com.example.fitnessgym.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domoin.entities.Sports
import com.example.domoin.usecase.GetClassesUseCase
import com.example.domoin.usecase.GetPopularUseCase
import com.example.domoin.usecase.GetTopUseCase
import com.example.fitnessgym.data.Constants
import kotlinx.coroutines.launch

class HomeViewModel(
    private val getTopUseCase: GetTopUseCase,
    private val getPopularUseCase: GetPopularUseCase,
    private val getClassesUseCase: GetClassesUseCase)
    : ViewModel() {

    fun getResultTop(): MutableList<Sports> {
        var mutableData = mutableListOf<Sports>()
        viewModelScope.launch{
            mutableData = getTopUseCase.invoke(Constants.getTopData())
        }

        return mutableData
    }

    fun getResultPopular(): MutableList<Sports> {
        var mutableData = mutableListOf<Sports>()
        viewModelScope.launch{
            mutableData = getPopularUseCase.invoke(Constants.getPopularData())
        }

        return mutableData
    }

    fun getResultClasses(): MutableList<Sports> {
        var mutableData = mutableListOf<Sports>()
        viewModelScope.launch{
            mutableData = getClassesUseCase.invoke(Constants.getClassesData())
        }

        return mutableData
    }
}
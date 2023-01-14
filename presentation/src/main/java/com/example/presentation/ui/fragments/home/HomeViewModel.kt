package com.example.presentation.ui.fragments.home

import com.example.domain.usecases.GetQuestionsUseCase
import com.example.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    val getQuestionsUseCase: GetQuestionsUseCase
) : BaseViewModel() {

    fun getAnswer(difficulty: String) = getQuestionsUseCase(difficulty)
}
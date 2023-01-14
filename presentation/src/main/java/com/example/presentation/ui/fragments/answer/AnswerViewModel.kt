package com.example.presentation.ui.fragments.answer

import com.example.domain.usecases.GetBallsUseCase
import com.example.domain.usecases.GetQuestionsUseCase
import com.example.domain.usecases.SetBallsUseCase
import com.example.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnswerViewModel @Inject constructor(
    val getBallsUseCase: GetBallsUseCase,
    val setBallsUseCase: SetBallsUseCase
) : BaseViewModel() {

    fun getBalls() = getBallsUseCase()

    fun setBalls(count: Int) = setBallsUseCase(count)
}
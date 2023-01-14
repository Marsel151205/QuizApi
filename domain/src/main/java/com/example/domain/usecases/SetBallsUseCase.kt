package com.example.domain.usecases

import com.example.domain.repositories.QuestionsRepository
import javax.inject.Inject

class SetBallsUseCase @Inject constructor(
    private val questionsRepository: QuestionsRepository
) {

    operator fun invoke(count: Int) = questionsRepository.setBalls(count)
}
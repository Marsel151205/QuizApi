package com.example.domain.usecases

import com.example.domain.repositories.QuestionsRepository
import javax.inject.Inject

class GetBallsUseCase @Inject constructor(
    private val questionsRepository: QuestionsRepository
) {

    operator fun invoke() = questionsRepository.getBalls()
}
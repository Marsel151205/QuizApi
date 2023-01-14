package com.example.domain.usecases

import com.example.domain.repositories.QuestionsRepository
import javax.inject.Inject

class GetQuestionsUseCase @Inject constructor(
    private val questionsRepository: QuestionsRepository
) {

    operator fun invoke(difficulty: String) = questionsRepository.getQuestions(difficulty)
}
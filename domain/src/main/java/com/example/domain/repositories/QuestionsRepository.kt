package com.example.domain.repositories

import com.example.common.either.Either
import com.example.domain.models.QuizModel
import kotlinx.coroutines.flow.Flow

interface QuestionsRepository {

    fun getQuestions(difficulty: String): Flow<Either<String, QuizModel>>

    fun getBalls(): Int

    fun setBalls(count: Int)
}
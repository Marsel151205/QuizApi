package com.example.presentation.models

import com.example.domain.models.QuizModel
import com.example.presentation.base.IBaseDiffModel

data class QuizUI(
    override val id: Int,
    val question: String,
    val description: String,
    val answers: AnswersUI,
    val multipleCorrectAnswer: Boolean,
    val correctAnswers: CorrectUI,
    val explanation: String,
    val tip: String? = null,
    val category: String,
    val difficulty: String
) : IBaseDiffModel<Int>

fun QuizModel.toUI() = QuizUI(
    id = id,
    question = question,
    description = description,
    answers = answers.toUI(),
    multipleCorrectAnswer = multipleCorrectAnswer,
    correctAnswers = correctAnswers.toUI(),
    explanation = explanation,
    tip = tip,
    category = category,
    difficulty = difficulty
)

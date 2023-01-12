package com.example.domain.models

data class QuizModel(
    val id: Int,
    val question: String,
    val description: String,
    val answers: AnswersModel,
    val multipleCorrectAnswer: Boolean,
    val correctAnswers: CorrectModel,
    val tip: String? = null,
    val category: String,
    val difficulty: String
)

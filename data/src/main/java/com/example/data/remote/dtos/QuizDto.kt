package com.example.data.remote.dtos

import com.example.domain.models.QuizModel
import com.google.gson.annotations.SerializedName

data class QuizDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("question")
    val question: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("answers")
    val answers: AnswersDto,
    @SerializedName("multiple_correct_answers")
    val multipleCorrectAnswer: Boolean,
    @SerializedName("correct_answers")
    val correctAnswers: CorrectDto,
    @SerializedName("explanation")
    val explanation: String,
    @SerializedName("tip")
    val tip: String? = null,
    @SerializedName("category")
    val category: String,
    @SerializedName("difficulty")
    val difficulty: String
)

fun QuizDto.toDomain() = QuizModel(
    id = id,
    question = question,
    description = description,
    answers = answers.toDomain(),
    multipleCorrectAnswer = multipleCorrectAnswer,
    correctAnswers = correctAnswers.toDomain(),
    explanation = explanation,
    tip = tip,
    category = category,
    difficulty = difficulty
)
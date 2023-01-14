package com.example.presentation.models

import com.example.domain.models.AnswersModel

data class AnswersUI(
    val answerA: String? = null,
    val answerB: String? = null,
    val answerC: String? = null,
    val answerD: String? = null,
    val answerE: String? = null,
    val answerF: String? = null
)

fun AnswersModel.toUI() = AnswersUI(
    answerA = answerA,
    answerB = answerB,
    answerC = answerC,
    answerD = answerD,
    answerE = answerE,
    answerF = answerF
)
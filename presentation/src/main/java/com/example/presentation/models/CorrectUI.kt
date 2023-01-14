package com.example.presentation.models

import com.example.domain.models.CorrectModel

data class CorrectUI(
    val answerACorrect: Boolean,
    val answerBCorrect: Boolean,
    val answerCCorrect: Boolean,
    val answerDCorrect: Boolean,
    val answerECorrect: Boolean,
    val answerFCorrect: Boolean
)

fun CorrectModel.toUI() = CorrectUI(
    answerACorrect = answerACorrect,
    answerBCorrect = answerBCorrect,
    answerCCorrect = answerCCorrect,
    answerDCorrect = answerDCorrect,
    answerECorrect = answerECorrect,
    answerFCorrect = answerFCorrect
)
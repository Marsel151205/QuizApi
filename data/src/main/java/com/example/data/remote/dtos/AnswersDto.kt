package com.example.data.remote.dtos

import com.example.domain.models.AnswersModel
import com.google.gson.annotations.SerializedName

data class AnswersDto(
    @SerializedName("answers_a")
    val answerA: String? = null,
    @SerializedName("answers_b")
    val answerB: String? = null,
    @SerializedName("answers_c")
    val answerC: String? = null,
    @SerializedName("answers_d")
    val answerD: String? = null,
    @SerializedName("answers_e")
    val answerE: String? = null,
    @SerializedName("answers_f")
    val answerF: String? = null
)

fun AnswersDto.toDomain() = AnswersModel(
    answerA = answerA,
    answerB = answerB,
    answerC = answerC,
    answerD = answerD,
    answerE = answerE,
    answerF = answerF
)

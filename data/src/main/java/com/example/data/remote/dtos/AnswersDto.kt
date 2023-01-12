package com.example.data.remote.dtos

import com.example.domain.models.AnswersModel
import com.google.gson.annotations.SerializedName

data class AnswersDto(
    @SerializedName("answers_a")
    val answersA: String? = null,
    @SerializedName("answers_b")
    val answersB: String? = null,
    @SerializedName("answers_c")
    val answersC: String? = null,
    @SerializedName("answers_d")
    val answersD: String? = null,
    @SerializedName("answers_e")
    val answerE: String? = null,
    @SerializedName("answers_f")
    val answersF: String? = null
)

fun AnswersDto.toDomain() = AnswersModel(
    answersA = answersA,
    answersB = answersB,
    answersC = answersC,
    answersD = answersD,
    answerE = answerE,
    answersF = answersF
)

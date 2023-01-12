package com.example.data.remote.dtos

import com.example.domain.models.CorrectModel
import com.google.gson.annotations.SerializedName

data class CorrectDto(
    @SerializedName("answer_a_correct")
    val answerACorrect: Boolean,
    @SerializedName("answer_b_correct")
    val answerBCorrect: Boolean,
    @SerializedName("answer_c_correct")
    val answerCCorrect: Boolean,
    @SerializedName("answer_d_correct")
    val answerDCorrect: Boolean,
    @SerializedName("answer_e_correct")
    val answerECorrect: Boolean,
    @SerializedName("answer_f_correct")
    val answerFCorrect: Boolean
)

fun CorrectDto.toDomain() = CorrectModel(
    answerACorrect = answerACorrect,
    answerBCorrect = answerBCorrect,
    answerCCorrect = answerCCorrect,
    answerDCorrect = answerDCorrect,
    answerECorrect = answerECorrect,
    answerFCorrect = answerFCorrect
)

package com.example.data.remote.apiservices

import com.example.data.remote.dtos.QuizDto
import retrofit2.http.GET
import retrofit2.http.Query

interface QuestionsApiService {

    @GET("api/v1/questions")
    suspend fun fetchQuestions(
        @Query("difficulty") difficulty: String
    ): QuizDto
}
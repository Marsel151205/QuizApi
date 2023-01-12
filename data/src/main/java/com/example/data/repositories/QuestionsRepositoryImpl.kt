package com.example.data.repositories

import com.example.data.base.BaseRepository
import com.example.data.remote.apiservices.QuestionsApiService
import com.example.data.remote.dtos.toDomain
import com.example.domain.repositories.QuestionsRepository
import javax.inject.Inject

class QuestionsRepositoryImpl @Inject constructor(
    private val service: QuestionsApiService
): BaseRepository(), QuestionsRepository {

    override fun getQuestions() = doRequest {
        service.fetchQuestions().toDomain()
    }
}
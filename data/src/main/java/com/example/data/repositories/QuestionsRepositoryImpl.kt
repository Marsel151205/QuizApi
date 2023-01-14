package com.example.data.repositories

import com.example.data.base.BaseRepository
import com.example.data.local.sharedpreferences.UserPreferenceHelper
import com.example.data.remote.apiservices.QuestionsApiService
import com.example.data.remote.dtos.toDomain
import com.example.domain.repositories.QuestionsRepository
import javax.inject.Inject

class QuestionsRepositoryImpl @Inject constructor(
    private val service: QuestionsApiService,
    private val prefetences: UserPreferenceHelper
) : BaseRepository(), QuestionsRepository {

    override fun getQuestions(difficulty: String) = doRequest {
        service.fetchQuestions(difficulty).toDomain()
    }

    override fun getBalls(): Int = prefetences.balls


    override fun setBalls(count: Int) {
        prefetences.balls = count
    }
}
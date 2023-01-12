package com.example.quizapi.di

import com.example.data.repositories.QuestionsRepositoryImpl
import com.example.domain.repositories.QuestionsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun bindQuestionsRepository(questionsRepositoryImpl: QuestionsRepositoryImpl): QuestionsRepository
}
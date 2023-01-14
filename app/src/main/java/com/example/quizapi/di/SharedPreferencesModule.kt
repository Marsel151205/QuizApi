package com.example.quizapi.di

import android.content.Context
import com.example.data.local.sharedpreferences.UserPreferenceHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SharedPreferencesModule {

    @Provides
    @Singleton
    fun provideUserPreferenceHelper(@ApplicationContext context: Context): UserPreferenceHelper =
        UserPreferenceHelper(context)
}
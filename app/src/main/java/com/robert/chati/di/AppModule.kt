package com.robert.chati.di

import com.google.ai.client.generativeai.GenerativeModel
import com.robert.chati.BuildConfig
import com.robert.chati.ai_chat_feature.data.repository.AiRepository
import com.robert.chati.ai_chat_feature.data.repository.AiRepositoryImpl
import com.robert.chati.ai_chat_feature.presentation.ChatScreen.ChatViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

    val appModule = module {

        single {
            GenerativeModel(
                modelName = "gemini-3-flash-preview",
                apiKey = BuildConfig.apiKey
            )
        }

        single<AiRepository> { AiRepositoryImpl(get()) }

        viewModel { ChatViewModel(get()) }
    }

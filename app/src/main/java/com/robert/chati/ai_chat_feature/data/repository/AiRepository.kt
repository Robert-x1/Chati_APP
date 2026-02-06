package com.robert.chati.ai_chat_feature.data.repository

import com.google.ai.client.generativeai.GenerativeModel

interface AiRepository {
    suspend fun sendPrompt(prompt: String): String
}

class AiRepositoryImpl(
    private val generativeModel: GenerativeModel
) : AiRepository {

    override suspend fun sendPrompt(prompt: String): String {
        return try {
            val response = generativeModel.generateContent(prompt)
            response.text ?: "Sorry I can't get it"
        } catch (e: Exception) {
            "Error: ${e.localizedMessage}"
        }
    }
}
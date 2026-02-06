package com.robert.chati.ai_chat_feature.presentation.ChatScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.robert.chati.ai_chat_feature.data.repository.AiRepository
import com.robert.chati.ai_chat_feature.domain.model.ChatMessage
import com.robert.chati.ai_chat_feature.domain.model.ChatUiState
import kotlinx.coroutines.launch

class ChatViewModel(
    private val repository: AiRepository
) : ViewModel() {

    var uiState by mutableStateOf(ChatUiState())
        private set

    fun onSendPrompt(prompt: String) {
        if (prompt.isBlank()) return

        val userMessage = ChatMessage(text = prompt, isUser = true)
        uiState = uiState.copy(
            messages = uiState.messages + userMessage,
            isLoading = true
        )

        viewModelScope.launch {
            val responseText = repository.sendPrompt(prompt)

            val aiMessage = ChatMessage(text = responseText, isUser = false)
            uiState = uiState.copy(
                messages = uiState.messages + aiMessage,
                isLoading = false
            )
        }
    }
}


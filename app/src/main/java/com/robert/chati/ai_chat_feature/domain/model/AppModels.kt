package com.robert.chati.ai_chat_feature.domain.model

data class ChatMessage(
    val text: String,
    val isUser: Boolean,
    val isError: Boolean = false
)
data class ChatUiState(
    val messages: List<ChatMessage> = emptyList(),
    val isLoading: Boolean = false
)

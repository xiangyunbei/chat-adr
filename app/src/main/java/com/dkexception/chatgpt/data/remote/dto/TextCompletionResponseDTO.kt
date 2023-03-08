package com.dkexception.chatgpt.data.remote.dto

import com.google.gson.annotations.SerializedName

data class TextCompletionResponseDTO(
    @SerializedName("choices")
    val choices: List<Choice?>? = null,
    @SerializedName("created")
    val created: Int? = null,
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("model")
    val model: String? = null,
    @SerializedName("object")
    val objectX: String? = null,
    @SerializedName("usage")
    val usage: Usage? = null
)

data class Choice(
    @SerializedName("finish_reason")
    val finishReason: String? = null,
    @SerializedName("index")
    val index: Int? = null,
    @SerializedName("message")
    val message: Message? = null
)

data class Message(
    @SerializedName("content")
    val content: String? = null,
    @SerializedName("role")
    val role: String? = null
)

package com.example.pushnotificationfcm

data class SendMessageDto(
    val to: String? = "",
    val notification: BodyNotification
)

data class BodyNotification(
    val title: String,
    val body: String
)

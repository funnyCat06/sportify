package com.example.sportify.matches_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class HalfTime(
    val away: Int,
    val home: Int
)
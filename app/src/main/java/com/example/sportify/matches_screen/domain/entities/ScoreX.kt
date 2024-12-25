package com.example.sportify.matches_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class ScoreX(
    val duration: String,
    val fullTime: FullTime,
    val halfTime: HalfTime,
    val winner: String
)
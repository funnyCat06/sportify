package com.example.sportify.match_list_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class ScoreX(
    val duration: String,
    val fullTime: Score,
    val halfTime: Score,
    val winner: String
)
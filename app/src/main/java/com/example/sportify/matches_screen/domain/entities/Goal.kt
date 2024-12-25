package com.example.sportify.matches_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class Goal(
    val assist: Assist,
    val injuryTime: Int,
    val minute: Int,
    val score: Score,
    val scorer: Scorer,
    val team: Team,
    val type: String
)
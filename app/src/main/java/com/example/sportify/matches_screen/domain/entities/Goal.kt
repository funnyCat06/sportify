package com.example.sportify.matches_screen.domain.entities

data class Goal(
    val assist: Assist,
    val injuryTime: Any,
    val minute: Int,
    val score: Score,
    val scorer: Scorer,
    val team: Team,
    val type: String
)
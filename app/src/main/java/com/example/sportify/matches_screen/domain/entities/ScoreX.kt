package com.example.sportify.matches_screen.domain.entities

data class ScoreX(
    val duration: String,
    val fullTime: FullTime,
    val halfTime: HalfTime,
    val winner: String
)
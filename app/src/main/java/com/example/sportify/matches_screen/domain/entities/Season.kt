package com.example.sportify.matches_screen.domain.entities

data class Season(
    val currentMatchday: Int,
    val endDate: String,
    val id: Int,
    val stages: List<String>,
    val startDate: String,
    val winner: Any
)
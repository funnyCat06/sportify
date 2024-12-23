package com.example.sportify.matches_screen.domain.entities

data class Booking(
    val card: String,
    val minute: Int,
    val player: Player,
    val team: Team
)
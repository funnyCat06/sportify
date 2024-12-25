package com.example.sportify.matches_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class Penalty(
    val player: Player,
    val scored: Boolean,
    val team: Team
)
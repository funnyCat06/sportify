package com.example.sportify.matches_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class Substitution(
    val minute: Int,
    val playerIn: Player,
    val playerOut: Player,
    val team: Team
)
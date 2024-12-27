package com.example.sportify.match_list_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class Odds(
    val awayWin: Double,
    val draw: Double,
    val homeWin: Double
)
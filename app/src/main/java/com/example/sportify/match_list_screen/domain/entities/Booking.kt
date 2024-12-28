package com.example.sportify.match_list_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class Booking(

    val card: String,
    val minute: Int,
    val player: Player,
    val team: Team
)
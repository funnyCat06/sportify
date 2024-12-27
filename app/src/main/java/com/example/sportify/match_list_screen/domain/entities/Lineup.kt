package com.example.sportify.match_list_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class Lineup(
    val id: Int,
    val name: String,
    val position: String,
    val shirtNumber: Int
)
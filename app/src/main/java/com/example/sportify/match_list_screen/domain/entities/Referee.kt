package com.example.sportify.match_list_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class Referee(
    val id: Int,
    val name: String,
    val nationality: String,
    val type: String
)
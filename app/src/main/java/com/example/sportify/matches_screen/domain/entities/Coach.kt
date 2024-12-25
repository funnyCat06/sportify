package com.example.sportify.matches_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class Coach(
    val id: Int,
    val name: String,
    val nationality: String
)
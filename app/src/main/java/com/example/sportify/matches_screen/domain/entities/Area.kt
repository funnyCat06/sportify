package com.example.sportify.matches_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class Area(
    val code: String,
    val flag: String,
    val id: Int,
    val name: String
)
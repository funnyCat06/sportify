package com.example.sportify.match_list_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class Scorer(
    val id: Int,
    val name: String
)
package com.example.sportify.matches_screen.domain.entities

data class Lineup(
    val id: Int,
    val name: String,
    val position: String,
    val shirtNumber: Int
)
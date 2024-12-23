package com.example.sportify.matches_screen.domain.entities

data class Competition(
    val code: String,
    val emblem: String,
    val id: Int,
    val name: String,
    val type: String
)
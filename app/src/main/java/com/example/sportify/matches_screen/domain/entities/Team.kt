package com.example.sportify.matches_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class Team(
    val bench: List<Bench>,
    val coach: Coach,
    val crest: String,
    val formation: String,
    val id: Int,
    val leagueRank: Int,
    val lineup: List<Lineup>,
    val name: String,
    val shortName: String,
    val statistics: Statistics,
    val tla: String
)
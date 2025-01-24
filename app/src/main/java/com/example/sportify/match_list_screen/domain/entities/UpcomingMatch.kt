package com.example.sportify.match_list_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class UpcomingMatch(
    val area: Area,
    val awayTeam: Team,
    val competition: Competition1,
    val group: String?,
    val homeTeam: Team,
    val id: Int,
    val lastUpdated: String,
    val matchday: Int,
    val referees: List<Referee>,
    val season: Season,
    val stage: String?,
    val status: String,
    val utcDate: String,
)

@Serializable
data class Area(
    val code: String,
    val flag: String?,
    val id: Int,
    val name: String
)

@Serializable
data class Team(
    val crest: String,
    val id: Int,
    val name: String,
    val shortName: String,
    val tla: String
)

@Serializable
data class Competition1(
    val code: String,
    val emblem: String,
    val id: Int,
    val name: String,
    val type: String
)

@Serializable
data class Referee(
    val id: Int,
    val name: String,
    val nationality: String,
    val type: String
)

@Serializable
data class Season(
    val currentMatchday: Int,
    val endDate: String,
    val id: Int,
    val startDate: String,
)

package com.example.sportify.match_list_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class Match(
    val area: Area,
    val attendance: Int,
    val awayTeam: Team,
    val bookings: List<Booking>,
    val competition: Competition1,
    val goals: List<Goal>,
    val group: String,
    val homeTeam: Team,
    val id: Int,
    val injuryTime: Int,
    val lastUpdated: String,
    val matchday: Int,
    val minute: Int,
    val odds: Odds,
    val penalties: List<Penalty>,
    val referees: List<Referee>,
    val score: ScoreX,
    val season: Season,
    val stage: String,
    val status: String,
    val substitutions: List<Substitution>,
    val utcDate: String,
    val venue: String
)
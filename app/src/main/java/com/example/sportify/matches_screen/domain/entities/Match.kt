package com.example.sportify.matches_screen.domain.entities

data class Match(
    val area: Area,
    val attendance: Int,
    val awayTeam: AwayTeam,
    val bookings: List<Booking>,
    val competition: Competition,
    val goals: List<Goal>,
    val group: Any,
    val homeTeam: HomeTeam,
    val id: Int,
    val injuryTime: Int,
    val lastUpdated: String,
    val matchday: Int,
    val minute: Int,
    val odds: Odds,
    val penalties: List<Any?>,
    val referees: List<Referee>,
    val score: ScoreX,
    val season: Season,
    val stage: String,
    val status: String,
    val substitutions: List<Substitution>,
    val utcDate: String,
    val venue: String
)
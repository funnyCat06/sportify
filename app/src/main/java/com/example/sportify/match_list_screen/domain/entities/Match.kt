package com.example.sportify.match_list_screen.domain.entities

import kotlinx.serialization.Serializable

@Serializable
data class Match(
    val area: Area,
    val attendance: Int?,
    val awayTeam: Team,
    val bookings: List<Booking>?,
    val competition: Competition,
    val goals: List<Goal>?,
    val group: String?,
    val homeTeam: Team,
    val id: Int,
    val injuryTime: Int?,
    val lastUpdated: String,
    val matchday: Int,
    val minute: Int?,
    val penalties: List<Penalty>?,
    val referees: List<Referee>,
    val score: ScoreX,
    val season: Season,
    val stage: String?,
    val status: String,
    val substitutions: List<Substitution>?,
    val utcDate: String,
    val venue: String?
)

@Serializable
data class Area(
    val code: String,
    val flag: String,
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
data class Booking(
    val card: String,
    val minute: Int,
    val player: PlayerP,
    val team: TeamP
)

@Serializable
data class Competition(
    val code: String,
    val emblem: String,
    val id: Int,
    val name: String,
    val type: String
)

@Serializable
data class Goal(
    val assist: Assist,
    val injuryTime: Int,
    val minute: Int,
    val score: Score,
    val scorer: Scorer,
    val team: TeamP,
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
data class ScoreX(
    val duration: String,
    val fullTime: Score?,
    val halfTime: Score?,
    val winner: String?
)

@Serializable
data class Season(
    val currentMatchday: Int,
    val endDate: String,
    val id: Int,
    val startDate: String,
)

@Serializable
data class Substitution(
    val minute: Int,
    val playerIn: PlayerIn,
    val playerOut: PlayerOut,
    val team: TeamP
)

@Serializable
data class Bench(
    val id: Int,
    val name: String,
    val position: String,
    val shirtNumber: Int
)

@Serializable
data class Coach(
    val id: Int,
    val name: String,
    val nationality: String
)

@Serializable
data class Lineup(
    val id: Int,
    val name: String,
    val position: String,
    val shirtNumber: Int
)

@Serializable
data class Statistics(
    val ball_possession: Int,
    val corner_kicks: Int,
    val fouls: Int,
    val free_kicks: Int,
    val goal_kicks: Int,
    val offsides: Int,
    val red_cards: Int,
    val saves: Int,
    val shots: Int,
    val shots_off_goal: Int,
    val shots_on_goal: Int,
    val throw_ins: Int,
    val yellow_cards: Int,
    val yellow_red_cards: Int
)

@Serializable
data class Player(
    val id: Int,
    val name: String
)

@Serializable
data class Assist(
    val id: Int,
    val name: String
)

@Serializable
data class Score(
    val away: Int?,
    val home: Int?
)

@Serializable
data class Scorer(
    val id: Int,
    val name: String
)

@Serializable
data class PlayerIn(
    val id: Int,
    val name: String
)

@Serializable
data class PlayerOut(
    val id: Int,
    val name: String
)

@Serializable
data class Penalty(
    val player: PlayerP,
    val scored: Boolean,
    val team: TeamP
)

@Serializable
data class PlayerP(
    val id: Int,
    val name: String
)

@Serializable
data class TeamP(
    val id: Int,
    val name: String
)
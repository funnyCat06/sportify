package com.example.sportify.match_list_screen.domain.entities

import kotlinx.serialization.Serializable

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
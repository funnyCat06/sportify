package com.example.sportify.match_list_screen.data.networing

import com.example.sportify.match_list_screen.domain.entities.Match
import kotlinx.serialization.Serializable


@Serializable
data class MatchesDto(
    val matches: List<Match>
)

package com.example.sportify.matches_screen.data.networing

import com.example.sportify.matches_screen.domain.entities.Match
import kotlinx.serialization.Serializable


@Serializable
data class MatchesDto(
    val matches: List<Match>
)

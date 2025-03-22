package com.example.sportify.match_list_screen.data.networing

import com.example.sportify.match_list_screen.domain.entities.NetworkMatch
import kotlinx.serialization.Serializable


@Serializable
data class MatchesDto(
    val networkMatches: List<NetworkMatch>
)

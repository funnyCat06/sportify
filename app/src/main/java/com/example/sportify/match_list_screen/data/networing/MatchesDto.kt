package com.example.sportify.match_list_screen.data.networing

import com.example.sportify.match_list_screen.domain.entities.UpcomingMatch
import kotlinx.serialization.Serializable


@Serializable
data class MatchesDto(
    val matches: List<UpcomingMatch>
)

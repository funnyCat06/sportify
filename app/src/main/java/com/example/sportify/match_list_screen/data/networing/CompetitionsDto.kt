package com.example.sportify.match_list_screen.data.networing

import com.example.sportify.match_list_screen.domain.entities.Competition
import kotlinx.serialization.Serializable

@Serializable
data class CompetitionsDto(
    val competitions: List<Competition>
)
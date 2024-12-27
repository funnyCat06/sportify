package com.example.sportify.match_list_screen.domain.entities

import com.example.sportify.match_list_screen.presentation.CompetitionUi
import kotlinx.serialization.Serializable

@Serializable
data class Competition1(
    val code: String,
    val emblem: String,
    val id: Int,
    val name: String,
    val type: String
) {
    fun toCompetitionUi(): CompetitionUi {
        return CompetitionUi(
            name = this.name,
            imageRes = this.emblem
        )

    }
}
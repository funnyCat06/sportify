package com.example.sportify.match_list_screen.presentation

import com.example.sportify.match_list_screen.domain.entities.Referee
import com.example.sportify.match_list_screen.domain.entities.Season
import java.time.LocalDateTime


data class UpcomingMatchUi(
    val id: Int,
    val competitionUi: CompetitionUi,
    val homeTeam: TeamUi,
    val awayTeam: TeamUi,
    val dateTime: LocalDateTime,
    val stage: String,
    val group: String,
    val lastUpdated: String,
    val matchDay: Int,
    val referees: List<Referee>,
    val season: Season,
    val status: String,
)

data class TeamUi(
    val name: String,
    val shortName: String,
    val tla: String,
    val crest: String,
)
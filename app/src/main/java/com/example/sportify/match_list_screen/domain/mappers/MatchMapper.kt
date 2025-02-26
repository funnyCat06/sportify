package com.example.sportify.match_list_screen.domain.mappers

import com.example.sportify.match_list_screen.domain.entities.Competition
import com.example.sportify.match_list_screen.domain.entities.Competition1
import com.example.sportify.match_list_screen.domain.entities.Team
import com.example.sportify.match_list_screen.domain.entities.UpcomingMatch
import com.example.sportify.match_list_screen.presentation.CompetitionUi
import com.example.sportify.match_list_screen.presentation.TeamUi
import com.example.sportify.match_list_screen.presentation.UpcomingMatchUi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun UpcomingMatch.toUpcomingMatchUi(): UpcomingMatchUi {
    return UpcomingMatchUi(
        competitionUi = this.competition.toCompetitionUi(),
        homeTeam = this.homeTeam.toTeamUi(),
        awayTeam = this.awayTeam.toTeamUi(),
        stage = this.stage ?: "no stage",
        dateTime = this.utcDate.formatAsDate(),
        referees = this.referees,
        id = this.id,
        group = this.group ?: "no group",
        lastUpdated = this.lastUpdated,
        matchDay = this.matchday,
        season = this.season,
        status = this.status,
    )
}

private fun Competition1.toCompetitionUi(): CompetitionUi {
   return CompetitionUi(
        id = this.id,
        name = this.name,
        emblem = this.emblem
    )
}

fun Competition.toCompetitionUi(): CompetitionUi {
    return CompetitionUi(
        id = this.id,
        name = this.name,
        emblem = this.emblem
    )
}

private fun Team.toTeamUi(): TeamUi {
    return TeamUi(
        name = this.name ?: "Unknown Team",
        shortName = this.shortName ?: "Unknown",
        tla = this.tla ?: "UNK",
        crest = this.crest ?: ""
    )
}

private fun String.formatAsDate(): LocalDateTime {
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'")
    return LocalDateTime.parse(this, formatter)
}

fun Int.to12(): String {
    return if (this > 12) "${this.minus(12)} pm" else "$this am"
}
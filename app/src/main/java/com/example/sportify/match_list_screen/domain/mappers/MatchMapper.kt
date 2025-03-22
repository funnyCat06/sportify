package com.example.sportify.match_list_screen.domain.mappers

import com.example.sportify.match_list_screen.domain.entities.Competition
import com.example.sportify.match_list_screen.domain.entities.Competition1
import com.example.sportify.match_list_screen.domain.entities.MatchEntity
import com.example.sportify.match_list_screen.domain.entities.NetworkMatch
import com.example.sportify.match_list_screen.domain.entities.Team
import com.example.sportify.match_list_screen.presentation.CompetitionUi
import com.example.sportify.match_list_screen.presentation.MatchUi
import com.example.sportify.match_list_screen.presentation.TeamUi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun NetworkMatch.toEntity(): MatchEntity =
    MatchEntity(
        id = this.id,
        area = this.area,
        homeTeam = this.homeTeam,
        awayTeam = this.awayTeam,
        competition = this.competition,
        group = this.group,
        lastUpdated = this.lastUpdated,
        matchday = this.matchday,
        referees = this.referees,
        season = this.season,
        stage = this.stage,
        status = this.status,
        utcDate = this.utcDate,
        score = this.score,
    )

fun NetworkMatch.toUpcomingMatchUi(): MatchUi =
    MatchUi(
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
        score = this.score
    )


private fun Competition1.toCompetitionUi(): CompetitionUi =
    CompetitionUi(
        id = this.id,
        name = this.name,
        emblem = this.emblem
    )


fun Competition.toCompetitionUi(): CompetitionUi =
    CompetitionUi(
        id = this.id,
        name = this.name,
        emblem = this.emblem
    )


private fun Team.toTeamUi(): TeamUi =
    TeamUi(
        name = this.name ?: "Unknown Team",
        shortName = this.shortName ?: "Unknown",
        tla = this.tla ?: "UNK",
        crest = this.crest ?: ""
    )


private fun String.formatAsDate(): LocalDateTime {
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'")
    return LocalDateTime.parse(this, formatter)
}

fun Int.to12(): String {
    return if (this > 12) "${this.minus(12)} pm" else "$this am"
}
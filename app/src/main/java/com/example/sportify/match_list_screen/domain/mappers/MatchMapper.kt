package com.example.sportify.match_list_screen.domain.mappers

import com.example.sportify.match_list_screen.domain.entities.Competition
import com.example.sportify.match_list_screen.domain.entities.Competition1
import com.example.sportify.match_list_screen.domain.entities.Team
import com.example.sportify.match_list_screen.domain.entities.UpcomingMatch
import com.example.sportify.match_list_screen.presentation.CompetitionUi
import com.example.sportify.match_list_screen.presentation.TeamUi
import com.example.sportify.match_list_screen.presentation.UpcomingMatchUi
import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun UpcomingMatch.toUpcomingMatchUi(): UpcomingMatchUi {
    return UpcomingMatchUi(
        competitionUi = this.competition.toCompetitionUi(),
        homeTeam = this.homeTeam.toTeamUi(),
        awayTeam = this.awayTeam.toTeamUi(),
        date = this.utcDate.substring(0..9).formatAsDate(),
        time = this.utcDate.substring(11..15),
        stage = this.stage ?: "no stage",
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
        name = this.name,
        emblem = this.emblem
    )
}

fun Competition.toCompetitionUi(): CompetitionUi {
    return CompetitionUi(
        name = this.name,
        emblem = this.emblem
    )
}

fun Team.toTeamUi(): TeamUi {
    return TeamUi(
        name = this.name,
        shortName = this.shortName,
        tla = this.tla,
        crest = this.crest
    )
}

fun String.formatAsDate(): LocalDate {
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    return LocalDate.parse(this, formatter)
}
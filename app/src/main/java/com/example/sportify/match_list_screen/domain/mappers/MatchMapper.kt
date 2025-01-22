package com.example.sportify.match_list_screen.domain.mappers

import com.example.sportify.match_list_screen.domain.entities.Competition
import com.example.sportify.match_list_screen.domain.entities.Team
import com.example.sportify.match_list_screen.domain.entities.UpcomingMatch
import com.example.sportify.match_list_screen.presentation.CompetitionUi
import com.example.sportify.match_list_screen.presentation.TeamUi
import com.example.sportify.match_list_screen.presentation.UpcomingMatchUi

fun UpcomingMatch.toUpcomingMatchUi(): UpcomingMatchUi {
    return UpcomingMatchUi(
        competitionUi = this.competition.toCompetitionUi(),
        homeTeam = this.homeTeam.toTeamUi(),
        awayTeam = this.awayTeam.toTeamUi(),
        time = this.utcDate,
        stage = this.stage.toString(),
        referees = this.referees,
        id = this.id,
        group = this.group ?: "no group",
        lastUpdated = this.lastUpdated,
        matchDay = this.matchday,
        season = this.season,
        status = this.status,
        utcDate = this.utcDate,
    )
}

private fun Competition.toCompetitionUi(): CompetitionUi {

   return CompetitionUi(
        name = this.name,
        emblem = this.emblem
    )
}

fun Team.toTeamUi(): TeamUi {
    return TeamUi(
        name = this.name,
        shortName = this.shortName,
        crest = this.crest
    )
}

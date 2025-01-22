package com.example.sportify.core.data.mappers

import com.example.sportify.match_list_screen.domain.entities.Competition
import com.example.sportify.match_list_screen.domain.entities.Team
import com.example.sportify.match_list_screen.domain.entities.UpcomingMatch
import com.example.sportify.match_list_screen.presentation.CompetitionUi
import com.example.sportify.match_list_screen.presentation.TeamUi
import com.example.sportify.match_list_screen.presentation.UpcomingMatchUi

fun UpcomingMatch.toMatchUi(): UpcomingMatchUi {
    return UpcomingMatchUi(
        competitionUi = this.competition.toCompetitionUi(),
        homeTeam = this.homeTeam.toTeamUi(),
        awayTeam = this.awayTeam.toTeamUi(),
        time = this.utcDate,
        stage = this.stage.toString()
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

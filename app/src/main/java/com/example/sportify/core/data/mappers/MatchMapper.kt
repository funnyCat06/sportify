package com.example.sportify.core.data.mappers

import com.example.sportify.match_list_screen.domain.entities.Competition
import com.example.sportify.match_list_screen.domain.entities.Match
import com.example.sportify.match_list_screen.domain.entities.Score
import com.example.sportify.match_list_screen.domain.entities.Team
import com.example.sportify.match_list_screen.presentation.CompetitionUi
import com.example.sportify.match_list_screen.presentation.MatchUi
import com.example.sportify.match_list_screen.presentation.TeamUi

fun Match.toMatchUi(): MatchUi {
    return MatchUi(
        competitionUi = this.competition.toCompetitionUi(),
        homeTeam = this.homeTeam.toTeamUi(),
        awayTeam = this.awayTeam.toTeamUi(),
        time = this.utcDate,
        score = this.score.fullTime ?: Score(0, 0),
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
        name = this.name.toString(),
        shortName = this.shortName.toString(),
        crest = this.crest.toString()
    )

}

package com.example.sportify.core.data.mappers

import com.example.sportify.match_list_screen.domain.entities.Match
import com.example.sportify.match_list_screen.domain.entities.Team
import com.example.sportify.match_list_screen.presentation.MatchUi
import com.example.sportify.match_list_screen.presentation.TeamUi

fun Match.toMatchUi(): MatchUi {
    return MatchUi(
        competitionUi = this.competition.toCompetitionUi(),
        homeTeam = this.homeTeam.toTeamUi(),
        awayTeam = this.awayTeam.toTeamUi(),
        time = this.utcDate,
        stage = this.stage
    )
}

fun Team.toTeamUi(): TeamUi {
    return TeamUi(
        name = this.name,
        shortName = this.shortName,
        crest = this.crest
    )

}

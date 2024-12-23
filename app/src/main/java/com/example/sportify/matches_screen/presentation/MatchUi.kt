package com.example.sportify.matches_screen.presentation

import androidx.annotation.DrawableRes
import com.example.sportify.R

data class MatchUi(
    val league: LeagueUi,
    val homeTeam: TeamUi,
    val awayTeam: TeamUi,
    val time: String,
    val stage: String,
)

data class TeamUi(
    val name: String,
    val shortName: String,
    val score: Int = 0,
    @DrawableRes val logo: Int
)

val matchUiPreviewItem = MatchUi(
    league = LeagueUi(
        name = "Premier League",
        imageRes = R.drawable.premier_league
    ),
    homeTeam = TeamUi(
        name = "Arsenal",
        shortName = "ARSENAL",
        score = 2,
        logo = R.drawable.arsenal,
    ),
    awayTeam = TeamUi(
        name = "Manchester United",
        shortName = "MAN UTD",
        score = 0,
        logo = R.drawable.manchester_united,
    ),
    time = "7pm",
    stage = "LEAGUE MATCH"
)

val matchUiPreviewList =
    listOf(matchUiPreviewItem, matchUiPreviewItem, matchUiPreviewItem, matchUiPreviewItem)
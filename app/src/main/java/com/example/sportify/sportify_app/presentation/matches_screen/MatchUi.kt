package com.example.sportify.sportify_app.presentation.matches_screen

import androidx.annotation.DrawableRes
import com.example.sportify.R

data class MatchUi(
    val league: LeagueUi,
    val homeTeam: Team,
    val awayTeam: Team,
    val time: String,
    val stage: String,
)

data class Team(
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
    homeTeam = Team(
        name = "Arsenal",
        shortName = "ARSENAL",
        score = 2,
        logo = R.drawable.arsenal,
    ),
    awayTeam = Team(
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
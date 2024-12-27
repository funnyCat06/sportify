package com.example.sportify.match_list_screen.presentation

import androidx.annotation.DrawableRes
import com.example.sportify.R

data class LeagueUi(
    val name: String,
    @DrawableRes val imageRes: Int
)

val leagueUiList = listOf( LeagueUi(
    "Premier League",
    R.drawable.premier_league
),
    LeagueUi(
        "Premier League",
        R.drawable.premier_league
    ),
    LeagueUi(
        "Premier League",
        R.drawable.premier_league
    ),
    LeagueUi(
        "Premier League",
        R.drawable.premier_league
    ),
    LeagueUi(
        "Premier League",
        R.drawable.premier_league
    ),
    LeagueUi(
        "Premier League",
        R.drawable.premier_league
    ),
)
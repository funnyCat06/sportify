package com.example.sportify.sportify_app.presentation.matches_screen

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
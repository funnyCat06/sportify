package com.example.sportify.match_list_screen.presentation

import com.example.sportify.match_list_screen.domain.entities.Referee
import com.example.sportify.match_list_screen.domain.entities.Season


data class UpcomingMatchUi(
    val id: Int,
    val competitionUi: CompetitionUi,
    val homeTeam: TeamUi,
    val awayTeam: TeamUi,
    val date: String,
    val time: String,
    val stage: String,
    val group: String,
    val lastUpdated: String,
    val matchDay: Int,
    val referees: List<Referee>,
    val season: Season,
    val status: String,
)

data class TeamUi(
    val name: String,
    val shortName: String,
    val tla: String,
    val crest: String,
)

val upcomingMatchUiPreviewItem = UpcomingMatchUi(
    competitionUi = CompetitionUi(
        name = "Premier League",
        emblem = "https://crests.football-data.org/PL.png"
    ),
    homeTeam = TeamUi(
        name = "Arsenal",
        shortName = "ARSENAL",
        tla = "ARS",
        crest = "https://crests.football-data.org/66.png",
    ),
    awayTeam = TeamUi(
        name = "Manchester United",
        shortName = "Man United",
        tla = "MUN",
        crest = "https://crests.football-data.org/66.png"

    ),
    stage = "LEAGUE MATCH",
    referees = listOf(
        Referee(id = 0, name = "nigga", "Syrian", type = "IDK"),
        Referee(id = 1, name = "nigga", "Syrian", type = "IDK"),
        Referee(id = 2, name = "nigga", "Syrian", type = "IDK"),
        Referee(id = 3, name = "nigga", "Syrian", type = "IDK"),
    ),
    id = 0,
    group = "REGULAR_SEASON",
    lastUpdated = "YESTERDAY",
    matchDay = 14,
    season = Season(currentMatchday = 14, endDate = "", id = 0, startDate = ""),
    status = "",
    date = "",
    time = "",
)

val matchUiPreviewList =
    listOf(
        upcomingMatchUiPreviewItem,
        upcomingMatchUiPreviewItem,
        upcomingMatchUiPreviewItem,
        upcomingMatchUiPreviewItem
    )
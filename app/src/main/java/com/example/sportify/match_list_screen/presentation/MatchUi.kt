package com.example.sportify.match_list_screen.presentation


data class MatchUi(
    val competitionUi: CompetitionUi,
    val homeTeam: TeamUi,
    val awayTeam: TeamUi,
    val time: String,
    val stage: String,
)

data class TeamUi(
    val name: String,
    val shortName: String,
    val crest: String,
)

val matchUiPreviewItem = MatchUi(
    competitionUi = CompetitionUi(
        name = "Premier League",
        emblem = "https://crests.football-data.org/PL.png"
    ),
    homeTeam = TeamUi(
        name = "Arsenal",
        shortName = "ARSENAL",
        crest = "https://crests.football-data.org/66.png"

    ),
    awayTeam = TeamUi(
        name = "Manchester United",
        shortName = "MAN UTD",
        crest = "https://crests.football-data.org/66.png"
    ),
    time = "7pm",
    stage = "LEAGUE MATCH"
)

val matchUiPreviewList =
    listOf(matchUiPreviewItem, matchUiPreviewItem, matchUiPreviewItem, matchUiPreviewItem)
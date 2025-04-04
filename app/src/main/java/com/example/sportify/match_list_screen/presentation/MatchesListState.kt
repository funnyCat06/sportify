package com.example.sportify.match_list_screen.presentation

import java.time.LocalDate

data class MatchesListState(
    val competitions: List<CompetitionUi> = dummyCompetitions,
    val matches: Map<LocalDate, List<MatchUi>> = emptyMap(),
    val isLoading: Boolean = false,
    val selectedCompetitionId: Int = 2021,
    val selectedTab: MatchTab = MatchTab.UPCOMING,
    val isRefreshing: Boolean = true
)

val dummyCompetitionUi = CompetitionUi(id = 0, name = "Unknown", emblem = "")

val dummyCompetitions = (1..10).map { dummyCompetitionUi }.toList()
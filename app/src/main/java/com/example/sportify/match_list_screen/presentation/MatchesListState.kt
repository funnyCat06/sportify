package com.example.sportify.match_list_screen.presentation

import java.time.LocalDate

data class MatchesListState(
    val competitions: List<CompetitionUi> = emptyList(),
    val matches: Map<LocalDate, List<MatchUi>> = emptyMap(),
    val isLoading: Boolean = false,
    val selectedCompetitionId: Int = 2021,
    val selectedTabId: Int = 0
)
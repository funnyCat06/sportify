package com.example.sportify.match_list_screen.presentation

import java.time.LocalDate

data class MatchesListState(
    val matches: Map<LocalDate, List<UpcomingMatchUi>> = emptyMap(),
    val isLoading: Boolean = false
)

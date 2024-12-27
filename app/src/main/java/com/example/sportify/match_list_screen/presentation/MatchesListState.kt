package com.example.sportify.match_list_screen.presentation

data class MatchesListState(
    val matches: List<MatchUi> = emptyList(),
    val isLoading: Boolean = false
)

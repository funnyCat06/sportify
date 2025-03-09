package com.example.sportify.match_list_screen.presentation

import java.time.LocalDate

enum class MatchTab(
    val title: String,
    val dateFrom: LocalDate,
    val dateTo: LocalDate
) {
    UPCOMING(
        title = "Upcoming",
        dateFrom = LocalDate.now(),
        dateTo = LocalDate.now().plusMonths(1)
    ),
    PAST(
        title = "Past Matches",
        dateFrom = LocalDate.now().minusMonths(1),
        dateTo = LocalDate.now().minusDays(1),
    )
}
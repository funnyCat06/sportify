package com.example.sportify.match_list_screen.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.sportify.match_list_screen.presentation.CompetitionUi
import com.example.sportify.match_list_screen.presentation.competitionUiLists

@Composable
fun LeagueRow(
    competitionUiItems: List<CompetitionUi> = competitionUiLists
) {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        items(items = competitionUiItems) { item ->
            LeagueListItem(competitionUi = item)
        }
    }
}
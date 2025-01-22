package com.example.sportify.match_list_screen.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.sportify.match_list_screen.presentation.UpcomingMatchUi

@Composable
fun UpcomingMatchesList(
    modifier: Modifier = Modifier,
    matches: List<UpcomingMatchUi>
) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        items(items = matches) { matchUi ->
            UpcomingMatchListItem(upcomingMatchUi = matchUi)
        }
    }
}
package com.example.sportify.match_list_screen.presentation.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.sportify.match_list_screen.presentation.UpcomingMatchUi

@Composable
fun PastMatchesList(
    modifier: Modifier = Modifier,
    matches: List<UpcomingMatchUi>
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(items = matches) { match ->
//            PastMatchesListItem(match = match)
        }
    }
}
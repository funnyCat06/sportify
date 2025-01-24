package com.example.sportify.match_list_screen.presentation

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sportify.core.presentation.theme.ui.SportifyTheme
import com.example.sportify.match_list_screen.presentation.components.LeagueRow
import com.example.sportify.match_list_screen.presentation.components.MatchesTabRow
import com.example.sportify.match_list_screen.presentation.components.TopBar
import com.example.sportify.match_list_screen.presentation.components.UpcomingMatchesList


@Composable
fun MatchesScreen(
    uiState: MatchesListState = MatchesListState(),
) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .statusBarsPadding(),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        TopBar()
        LeagueRow(competitionUiItems = uiState.competitions)
        var selectedTabIndex by remember { mutableIntStateOf(0) }

        MatchesTabRow(
            modifier = Modifier.fillMaxWidth(0.75f),
            titles = listOf("Upcoming", "Past Matches"),
            selectedTabIndex = selectedTabIndex,
            onTabClick = { index ->
                selectedTabIndex = index
            }
        )
        // Animation might be tricky, though
        when (selectedTabIndex) {
            0 -> {
                UpcomingMatchesList(matches = uiState.matches)
            }

            1 -> {}
            else -> {
                Log.d("UpcomingMatchesScreen", "quit hacking me you son of a bitch" )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun UpcomingMatchesScreenPreview() {
    SportifyTheme {
        MatchesScreen()
    }
}
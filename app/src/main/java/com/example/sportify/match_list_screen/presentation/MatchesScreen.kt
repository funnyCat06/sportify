package com.example.sportify.match_list_screen.presentation

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sportify.core.presentation.theme.ui.SportifyTheme
import com.example.sportify.match_list_screen.presentation.components.CompetitionRow
import com.example.sportify.match_list_screen.presentation.components.MatchTab
import com.example.sportify.match_list_screen.presentation.components.MatchesTabRow
import com.example.sportify.match_list_screen.presentation.components.PastMatchesList
import com.example.sportify.match_list_screen.presentation.components.TopBar
import com.example.sportify.match_list_screen.presentation.components.UpcomingMatchesList
import java.time.LocalDate

@Composable
fun MatchesScreen(
    uiState: MatchesListState = MatchesListState(),
    onCompetitionClick: (Int) -> Unit = {},
    onTabClick: (Int) -> Unit = {}
) {
    val tabs = listOf(
        MatchTab(
            0,
            "Upcoming",
            dateFrom = LocalDate.now(),
            dateTo = LocalDate.now().plusMonths(1)
        ),
        MatchTab(
            1,
            "Past Matches",
            dateFrom = LocalDate.now().minusMonths(1),
            dateTo = LocalDate.now().minusDays(1)
        )
    )
    Column(
        modifier = Modifier
            .padding(16.dp)
            .statusBarsPadding(),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        TopBar()
        CompetitionRow(
            competitionUiItems = uiState.competitions,
            modifier = Modifier.fillMaxWidth(),
            onItemClick = onCompetitionClick
        )

        MatchesTabRow(
            tabs = tabs,
            selectedTabId = uiState.selectedTabId,
            modifier = Modifier.fillMaxWidth(0.75f),
            onTabClick = onTabClick
        )
        // Animation might be tricky, though
        when (uiState.selectedTabId) {
            0 -> {
                UpcomingMatchesList(matches = uiState.matches)
            }

            1 -> {
                PastMatchesList(matches = uiState.matches)
            }
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
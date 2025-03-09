package com.example.sportify.match_list_screen.presentation

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
import com.example.sportify.match_list_screen.presentation.components.MatchesTabRow
import com.example.sportify.match_list_screen.presentation.components.PastMatchesList
import com.example.sportify.match_list_screen.presentation.components.TopBar
import com.example.sportify.match_list_screen.presentation.components.UpcomingMatchesList

@Composable
fun MatchesScreen(
    uiState: MatchesListState = MatchesListState(),
    onCompetitionClick: (Int) -> Unit = { },
    onTabClick: (MatchTab) -> Unit = { }
) {
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
            modifier = Modifier.fillMaxWidth(0.75f),
            tabs = MatchTab.entries,
            selectedTab = uiState.selectedTab,
            onTabClick = onTabClick
        )
        // Animation might be tricky, though
        when (uiState.selectedTab) {
            MatchTab.UPCOMING -> {
                UpcomingMatchesList(matches = uiState.matches)
            }

            MatchTab.PAST -> {
                PastMatchesList(matches = uiState.matches)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun UpcomingMatchesScreenPreview() {
    SportifyTheme {
        MatchesScreen {}
    }
}
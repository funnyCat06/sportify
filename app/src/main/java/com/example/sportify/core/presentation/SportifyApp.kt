package com.example.sportify.core.presentation

import androidx.compose.runtime.Composable
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.sportify.match_list_screen.presentation.MatchViewModel
import com.example.sportify.match_list_screen.presentation.MatchesScreen
import org.koin.androidx.compose.koinViewModel

@Composable
fun SportifyApp(
    viewModel: MatchViewModel = koinViewModel()
) {
    MatchesScreen(
        uiState = viewModel.state.collectAsStateWithLifecycle().value,
        onCompetitionClick = viewModel::onCompetitionClick,
        onTabClick = viewModel::onMatchTabClick
    )
}
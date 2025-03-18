package com.example.sportify.core.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.sportify.match_list_screen.presentation.MatchListEvent
import com.example.sportify.match_list_screen.presentation.MatchViewModel
import com.example.sportify.match_list_screen.presentation.MatchesScreen
import kotlinx.coroutines.launch
import org.koin.androidx.compose.koinViewModel

@Composable
fun SportifyApp(
    viewModel: MatchViewModel = koinViewModel()
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    ObserveAsEvents(
        events = viewModel.events
    ) { event ->
        when (event) {
            is MatchListEvent.Error -> {
                scope.launch {
                   snackbarHostState.showSnackbar(event.error.toString(context))
                }
            }
        }
    }
    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) { padding ->
        MatchesScreen(
            uiState = viewModel.state.collectAsStateWithLifecycle().value,
            onCompetitionClick = viewModel::changeSelectedCompetitionId,
            onTabClick = viewModel::changeSelectedTab
        )
        Box(modifier = Modifier
            .size(0.dp)
            .padding(padding))
    }
}
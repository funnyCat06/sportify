package com.example.sportify.match_list_screen.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.koin.androidx.compose.koinViewModel

@Composable
fun SportifyApp(
    modifier: Modifier = Modifier,
    viewModel: MatchViewModel = koinViewModel()
) {
    Box(modifier = modifier, contentAlignment = Alignment.Center) {
        val state = viewModel.state.collectAsState()
        Text(
            text = "${state.value.matches}"
        )
    }
}
package com.example.sportify.core.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.sportify.match_list_screen.presentation.MatchViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun SportifyApp(
    viewModel: MatchViewModel = koinViewModel()
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        val state = viewModel.state.collectAsState()
        Text(
            text = "${state.value.matches}"
        )
    }
}
package com.example.sportify.core.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.sportify.core.presentation.theme.ui.SportifyTheme
import com.example.sportify.match_list_screen.presentation.MatchesScreen
import com.example.sportify.match_list_screen.presentation.competitionUiLists

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SportifyTheme {
                MatchesScreen(
                    competitionUiItems = competitionUiLists
                )
            }
        }
    }
}
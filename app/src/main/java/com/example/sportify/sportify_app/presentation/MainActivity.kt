package com.example.sportify.sportify_app.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.sportify.sportify_app.presentation.theme.ui.SportifyTheme
import com.example.sportify.sportify_app.presentation.matches_screen.MatchesScreen
import com.example.sportify.sportify_app.presentation.matches_screen.leagueUiList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SportifyTheme {
                MatchesScreen(
                    leagueUiItems = leagueUiList
                )
            }
        }
    }
}
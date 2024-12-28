package com.example.sportify.core.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.sportify.core.presentation.theme.ui.SportifyTheme
import com.example.sportify.match_list_screen.presentation.SportifyApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SportifyTheme {
                SportifyApp(
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}
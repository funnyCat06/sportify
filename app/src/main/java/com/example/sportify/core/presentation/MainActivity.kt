package com.example.sportify.core.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.domain.presentation.SportifyApp
import com.example.sportify.core.presentation.theme.ui.SportifyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SportifyTheme {
                SportifyApp()
            }
        }
    }
}
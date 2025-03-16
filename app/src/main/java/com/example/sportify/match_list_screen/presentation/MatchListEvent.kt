package com.example.sportify.match_list_screen.presentation

import com.example.sportify.core.domain.NetworkError

sealed interface MatchListEvent {
    data class Error(val error: NetworkError): MatchListEvent
}

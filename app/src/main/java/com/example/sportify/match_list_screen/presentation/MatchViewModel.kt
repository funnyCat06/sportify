package com.example.sportify.match_list_screen.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sportify.match_list_screen.domain.mappers.toUpcomingMatchUi
import com.example.sportify.core.domain.onError
import com.example.sportify.core.domain.onSuccess
import com.example.sportify.match_list_screen.domain.MatchDataSource
import com.example.sportify.match_list_screen.domain.entities.UpcomingMatch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MatchViewModel(
    private val matchDataSource: MatchDataSource
) : ViewModel() {
    private val _state = MutableStateFlow(MatchesListState())
    val state = _state
        .onStart { loadMatches() }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = MatchesListState()
        )

    fun loadMatches() {
        viewModelScope.launch {
            _state.update {
                it.copy(isLoading = true)
            }
            matchDataSource
                .getAllMatches()
                .onSuccess { matches ->
                    _state.update {
                        it.copy(
                            matches = matches.map { upcomingMatch: UpcomingMatch ->
                                upcomingMatch.toUpcomingMatchUi()
                            }
                        )
                    }
                }
                .onError { networkError ->
                    Log.d("loadMatches", networkError.name)
                }

        }
    }
}
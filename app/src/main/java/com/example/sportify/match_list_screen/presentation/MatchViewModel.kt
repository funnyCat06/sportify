package com.example.sportify.match_list_screen.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sportify.core.domain.onError
import com.example.sportify.core.domain.onSuccess
import com.example.sportify.match_list_screen.domain.MatchDataSource
import com.example.sportify.match_list_screen.domain.entities.Match
import com.example.sportify.match_list_screen.domain.mappers.toCompetitionUi
import com.example.sportify.match_list_screen.domain.mappers.toUpcomingMatchUi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.time.LocalDate

class MatchViewModel(
    private val matchDataSource: MatchDataSource
) : ViewModel() {
    private val _state = MutableStateFlow(MatchesListState())
    val state = _state
        .onStart {
            loadCompetitions()
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = MatchesListState()
        )

    fun onCompetitionClick(id: Int) {
        _state.update {
            it.copy(selectedCompetitionId = id)
        }
        loadMatches(_state.value.selectedCompetitionId)
    }

    fun onMatchTabClick(id: Int) {
        _state.update {
            it.copy(selectedTabId = id)
        }
    }

    private fun loadMatches(id: Int) {
        viewModelScope.launch {
            _state.update {
                it.copy(isLoading = true)
            }
            matchDataSource
                .getMatchesByCompetitionId(id, LocalDate.now(), LocalDate.now().plusMonths(1))
                .onSuccess { matches ->
                    _state.update { state ->
                        state.copy(
                            matches = matches.map { match: Match ->
                                match.toUpcomingMatchUi()
                            }.groupBy {
                                it.dateTime.toLocalDate()
                            }
                        )
                    }
                }
                .onError { networkError ->
                    Log.d("loadMatches", networkError.name)
                }
        }
    }

    private fun loadCompetitions() {
        viewModelScope.launch {
            _state.update {
                it.copy(
                    isLoading = true
                )
            }
            matchDataSource
                .getAllCompetitions()
                .onSuccess { competitions ->
                    _state.update {
                        it.copy(
                            competitions = competitions.map { competition ->
                                competition.toCompetitionUi()
                            },
                            selectedCompetitionId = competitions.first().id
                        )
                    }
                    loadMatches(_state.value.selectedCompetitionId)
                }
                .onError { networkError ->
                    Log.d("loadMatches", networkError.name)
                }
        }
    }
}
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

    fun changeSelectedCompetitionId(competitionId: Int) {
        _state.update {
            it.copy(selectedCompetitionId = competitionId)
        }
        loadMatches()
    }

    fun changeSelectedTab(tab: MatchTab) {
        _state.update {
            it.copy(selectedTab = tab)
        }
        loadMatches()
    }

    private fun loadMatches() {
        viewModelScope.launch {
            _state.update {
                it.copy(isLoading = true)
            }
            matchDataSource
                .getMatchesByCompetitionId(
                    _state.value.selectedCompetitionId,
                    _state.value.selectedTab.dateFrom,
                    _state.value.selectedTab.dateTo
                )
                .onSuccess { matches ->
                    _state.update { state ->
                        state.copy(
                            matches = matches.map { match: Match ->
                                match.toUpcomingMatchUi()
                            }.groupBy {
                                it.dateTime.toLocalDate()
                            },
                            isLoading = false
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
                            selectedCompetitionId = competitions.first().id,
                            isLoading = false
                        )
                    }
                    loadMatches()
                }
                .onError { networkError ->
                    Log.d("loadMatches", networkError.name)
                }
        }
    }
}
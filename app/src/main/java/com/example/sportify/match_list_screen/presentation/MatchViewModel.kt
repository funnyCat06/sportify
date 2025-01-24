package com.example.sportify.match_list_screen.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sportify.core.domain.onSuccess
import com.example.sportify.match_list_screen.domain.MatchDataSource
import com.example.sportify.match_list_screen.domain.mappers.toCompetitionUi
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
        .onStart { loadCompetitions() }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = MatchesListState()
        )

    //    private fun loadMatches() {
//        viewModelScope.launch {
//            _state.update {
//                it.copy(isLoading = true)
//            }
//            matchDataSource
//                .getAllMatches()
//                .onSuccess { matches ->
//                    _state.update { state ->
//                        state.copy(
//                            matches = matches.map { upcomingMatch: UpcomingMatch ->
//                                upcomingMatch.toUpcomingMatchUi()
//                            }.groupBy {
//                                it.date
//                            }
//                        )
//                    }
//                }
//                .onError { networkError ->
//                    Log.d("loadMatches", networkError.name)
//                }
//
//        }
//    }
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
                            }
                        )
                    }
                }
        }
    }
}
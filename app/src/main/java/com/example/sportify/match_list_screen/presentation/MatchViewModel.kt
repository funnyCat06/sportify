package com.example.sportify.match_list_screen.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sportify.core.data.mappers.toMatchUi
import com.example.sportify.core.domain.onError
import com.example.sportify.core.domain.onSuccess
import com.example.sportify.match_list_screen.domain.MatchRemoteDataSource
import com.example.sportify.match_list_screen.domain.entities.Match
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MatchViewModel(
    private val matchDataSource: MatchRemoteDataSource
) : ViewModel() {
    private val _state = MutableStateFlow(MatchesListState())
    val state = _state
        .onStart { loadMatches() }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = MatchesListState()
        )

    private fun loadMatches() {
        // update isLoading property to true
        viewModelScope.launch {
            _state.update {
                it.copy(isLoading = true)
            }
            matchDataSource
                .getAllMatches()
                .onSuccess { matches ->
                    _state.update {
                        it.copy(
                            matches = matches.map { match: Match ->
                                match.toMatchUi()
                            }
                        )
                    }
                }
                .onError {
                    Log.d("loadMatches", "Something went wrong")
                }

        }
    }
}
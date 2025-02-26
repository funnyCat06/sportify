package com.example.sportify.match_list_screen.domain

import com.example.sportify.core.domain.NetworkError
import com.example.sportify.core.domain.Result
import com.example.sportify.match_list_screen.domain.entities.Competition
import com.example.sportify.match_list_screen.domain.entities.Match

interface MatchDataSource {

    suspend fun getMatchesByCompetitionId(id: Int): Result<List<Match>, NetworkError>

    suspend fun getAllCompetitions(): Result<List<Competition>, NetworkError>
}
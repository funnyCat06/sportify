package com.example.sportify.match_list_screen.domain

import com.example.sportify.core.domain.NetworkError
import com.example.sportify.core.domain.Result
import com.example.sportify.match_list_screen.domain.entities.Competition
import com.example.sportify.match_list_screen.domain.entities.NetworkMatch
import java.time.LocalDate

interface MatchDataSource {

    suspend fun getMatchesByCompetitionId(id: Int, dateFrom: LocalDate, dateTo: LocalDate): Result<List<NetworkMatch>, NetworkError>

    suspend fun getAllCompetitions(): Result<List<Competition>, NetworkError>
}
package com.example.sportify.matches_screen.domain

import com.example.sportify.core.domain.NetworkError
import com.example.sportify.core.domain.Result
import com.example.sportify.matches_screen.data.networing.MatchesDto
import com.example.sportify.matches_screen.domain.entities.Match

interface MatchRemoteDataSource {

    suspend fun getAllMatches(): Result<List<Match>, NetworkError>

}
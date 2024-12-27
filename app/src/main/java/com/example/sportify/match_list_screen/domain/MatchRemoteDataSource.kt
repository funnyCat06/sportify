package com.example.sportify.match_list_screen.domain

import com.example.sportify.core.domain.NetworkError
import com.example.sportify.core.domain.Result
import com.example.sportify.match_list_screen.domain.entities.Match

interface MatchRemoteDataSource {

    suspend fun getAllMatches(): Result<List<Match>, NetworkError>

}
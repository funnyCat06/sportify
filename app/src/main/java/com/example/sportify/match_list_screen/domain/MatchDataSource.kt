package com.example.sportify.match_list_screen.domain

import com.example.sportify.core.domain.NetworkError
import com.example.sportify.core.domain.Result
import com.example.sportify.match_list_screen.domain.entities.UpcomingMatch

interface MatchDataSource {

    suspend fun getAllMatches(): Result<List<UpcomingMatch>, NetworkError>

}
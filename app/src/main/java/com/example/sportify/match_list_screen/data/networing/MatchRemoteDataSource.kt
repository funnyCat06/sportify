package com.example.sportify.match_list_screen.data.networing

import com.example.sportify.core.data.networking.util.constructUrl
import com.example.sportify.core.data.networking.util.safeCall
import com.example.sportify.core.domain.NetworkError
import com.example.sportify.core.domain.Result
import com.example.sportify.core.domain.map
import com.example.sportify.match_list_screen.domain.MatchDataSource
import com.example.sportify.match_list_screen.domain.entities.UpcomingMatch
import io.ktor.client.HttpClient
import io.ktor.client.request.get

// TODO: Change time dateFrom and dateTo parameters in request (check logcat)

private const val API_KEY = "6d570e89c85f44c7813f84049a54c4d6"

class MatchRemoteDataSource(private val httpClient: HttpClient) : MatchDataSource {

    override suspend fun getAllMatches(): Result<List<UpcomingMatch>, NetworkError> {
        return safeCall<MatchesDto> {
            httpClient.get(constructUrl("/matches")) {
                headers.append("X-Auth-Token", API_KEY)
            }
        }.map { dto ->
            dto.matches
        }
    }
}
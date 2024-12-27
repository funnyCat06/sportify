package com.example.sportify.match_list_screen.data.networing

import com.example.sportify.core.data.networking.util.constructUrl
import com.example.sportify.core.data.networking.util.safeCall
import com.example.sportify.core.domain.NetworkError
import com.example.sportify.core.domain.Result
import com.example.sportify.match_list_screen.domain.MatchRemoteDataSource
import com.example.sportify.match_list_screen.domain.entities.Match
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class MatchRemoteDataSourceImpl(private val httpClient: HttpClient) : MatchRemoteDataSource {

    override suspend fun getAllMatches(): Result<List<Match>, NetworkError> {
        return safeCall<List<Match>> {
            httpClient.get(constructUrl("/matches")) {

            }
        }
    }
}
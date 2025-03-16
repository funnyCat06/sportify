package com.example.sportify.core.data.networking.util

import com.example.sportify.core.domain.NetworkError
import com.example.sportify.core.domain.Result
import io.ktor.client.call.NoTransformationFoundException
import io.ktor.client.call.body
import io.ktor.client.statement.HttpResponse

suspend inline fun <reified T> responseToResult(response: HttpResponse): Result<T, NetworkError> {
    return when (response.status.value) {
        in 200..299 -> {
            try {
                Result.Success(response.body<T>())
            } catch (e: NoTransformationFoundException) {
                Result.Error(NetworkError.SERIALIZATION_ERROR)
            }
        }
        408 -> Result.Error(NetworkError.REQUEST_TIMEOUT)
        in 400..499 -> Result.Error(NetworkError.CLIENT_ERROR)
        in 500..599 -> Result.Error(NetworkError.SERVER_ERROR)
        else -> Result.Error(NetworkError.UNKNOWN_ERROR)

    }
}
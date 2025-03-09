package com.example.sportify.core.domain

enum class NetworkError: Error {
    NO_INTERNET,
    CLIENT_ERROR,
    SERVER_ERROR,
    SERIALIZATION_ERROR,
    UNKNOWN_ERROR
}
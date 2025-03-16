package com.example.sportify.core.presentation

import android.content.Context
import com.example.sportify.R
import com.example.sportify.core.domain.NetworkError

fun NetworkError.toString(context: Context): String {
    val stringId = when (this) {
        NetworkError.NO_INTERNET -> R.string.error_no_internet
        NetworkError.REQUEST_TIMEOUT -> R.string.error_request_timeout
        NetworkError.CLIENT_ERROR -> R.string.error_client
        NetworkError.SERVER_ERROR -> R.string.error_server
        NetworkError.SERIALIZATION_ERROR -> R.string.error_serialization
        NetworkError.UNKNOWN_ERROR -> R.string.error_unknown
    }
    return context.getString(stringId)
}
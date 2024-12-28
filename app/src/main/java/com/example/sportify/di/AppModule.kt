package com.example.sportify.di

import com.example.sportify.core.data.networking.util.HttpClientFactory
import com.example.sportify.match_list_screen.data.networing.MatchRemoteDataSource
import com.example.sportify.match_list_screen.domain.MatchDataSource
import com.example.sportify.match_list_screen.presentation.MatchViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::MatchRemoteDataSource).bind<MatchDataSource>()

    viewModelOf(::MatchViewModel)
}
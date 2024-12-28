package com.example.sportify.core.presentation

import android.app.Application
import com.example.sportify.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class SportifyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@SportifyApplication)
            androidLogger()

            modules(appModule)
        }
    }
}
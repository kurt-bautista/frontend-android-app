package com.example.frontendandroidapp

import android.app.Application
import timber.log.Timber

class FrontendApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}
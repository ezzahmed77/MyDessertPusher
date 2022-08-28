package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

class PusherApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        // Adding timber to use it instead of Log statements
        Timber.plant(Timber.DebugTree())
    }
}
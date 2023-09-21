package com.bintangpoetra.takehomechallenge.base

import android.app.Application
import com.bintangpoetra.takehomechallenge.di.mainModule
import com.bintangpoetra.takehomechallenge.di.networkModule
import com.bintangpoetra.takehomechallenge.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class BaseApp: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@BaseApp)
            modules(
                listOf(
                    mainModule,
                    networkModule,
                    viewModelModule
                )
            )
        }
    }

}
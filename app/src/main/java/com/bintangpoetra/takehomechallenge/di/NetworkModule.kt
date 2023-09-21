package com.bintangpoetra.takehomechallenge.di

import com.bintangpoetra.takehomechallenge.data.service.ApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

const val baseUrl = "https://d49c3a78-a4f2-437d-bf72-569334dea17c.mock.pstmn.io/"

val networkModule = module {

    single {
        return@single OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .build()
    }

    single {
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }

    single { provideApiService(get()) }

}

fun provideApiService(retrofit: Retrofit): ApiService =
    retrofit.create(ApiService::class.java)
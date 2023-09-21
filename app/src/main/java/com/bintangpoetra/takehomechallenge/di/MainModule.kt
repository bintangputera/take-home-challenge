package com.bintangpoetra.takehomechallenge.di

import com.bintangpoetra.takehomechallenge.data.MainDataStore
import com.bintangpoetra.takehomechallenge.data.MainRepository
import com.bintangpoetra.takehomechallenge.domain.MainInteractor
import com.bintangpoetra.takehomechallenge.domain.MainUseCase
import org.koin.dsl.module

var mainModule = module {

    factory<MainUseCase> { MainInteractor(get()) }
    factory<MainRepository> { MainDataStore(get()) }

    single { MainDataStore(get()) }
    single { MainInteractor(get()) }

}
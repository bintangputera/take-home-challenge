package com.bintangpoetra.takehomechallenge.di

import com.bintangpoetra.takehomechallenge.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel(get()) }
}
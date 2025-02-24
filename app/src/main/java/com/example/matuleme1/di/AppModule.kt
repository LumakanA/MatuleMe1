package com.example.matuleme1.di

import com.example.matuleme1.ui.screen.signin.SignInViewModule
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        SignInViewModule()
    }
}
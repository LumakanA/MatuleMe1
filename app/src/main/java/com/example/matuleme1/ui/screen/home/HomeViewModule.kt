package com.example.matuleme1.ui.screen.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class HomeViewModule : ViewModel() {
    var state by mutableStateOf(HomeState())
        private set

}

data class HomeState(
    val error: String? = null
)
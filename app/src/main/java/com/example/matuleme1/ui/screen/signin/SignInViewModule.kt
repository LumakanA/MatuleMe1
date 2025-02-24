package com.example.matuleme1.ui.screen.signin

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SignInViewModule : ViewModel() {
    var state by mutableStateOf(SignInState())
        private set

    fun updateEmail(email: String) {
        state = state.copy(
            email = email
        )
    }

    fun updatePassword(password: String) {
        state = state.copy(
            password = password
        )
    }
}

data class SignInState(
    val email: String = "",
    val password: String = "",
    val error: String? = null
)
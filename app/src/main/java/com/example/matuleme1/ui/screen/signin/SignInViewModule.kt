package com.example.matuleme1.ui.screen.signin

import android.util.Patterns
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.util.regex.Pattern
import javax.xml.validation.Validator

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

    fun validateEmail(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun validatePassword(password: String): Boolean {
        return password.length > 8
    }

    fun login(email: String, password: String): Boolean {
        return validateEmail(email) && validatePassword(password)
    }
}

data class SignInState(
    val email: String = "",
    val password: String = "",
    val error: String? = null
)
package com.example.matuleme1.ui.navigation

sealed class ScreensRouts(val route: String) {
    data object SignInScreen: ScreensRouts("SignInScreen")
}
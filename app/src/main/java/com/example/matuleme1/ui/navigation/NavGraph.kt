package com.example.matuleme1.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.matuleme1.ui.screen.signin.SignInScreen
import org.koin.androidx.compose.koinViewModel

@Composable
fun NavGraph(
    navHostController: NavHostController,
    startScreen: String
) {
    NavHost(navController = navHostController, startDestination = startScreen) {
        composable(ScreensRouts.SignInScreen.route) {
            SignInScreen(vm = koinViewModel(), navController = navHostController)
        }
    }
}
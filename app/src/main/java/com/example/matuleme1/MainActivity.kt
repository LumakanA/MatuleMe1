package com.example.matuleme1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.example.matuleme1.ui.navigation.NavGraph
import com.example.matuleme1.ui.navigation.ScreensRouts
import com.example.matuleme1.ui.theme.MatuleMe1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            val navController = rememberNavController()
            MatuleMe1Theme {
                NavGraph(
                    navHostController = navController,
                    startScreen = ScreensRouts.SignInScreen.route
                )
            }
        }
    }
}
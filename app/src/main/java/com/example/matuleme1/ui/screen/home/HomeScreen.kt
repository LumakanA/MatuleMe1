package com.example.matuleme1.ui.screen.signin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.matuleme1.ui.screen.home.HomeViewModule
import com.example.matuleme1.ui.theme.BlockColor

@Composable
fun HomeScreen(
    vm: HomeViewModule,
    navController: NavController
) {

    val state = vm.state

    Scaffold { containerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(containerPadding)
                .background(BlockColor)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {

            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen(vm = HomeViewModule(), navController = rememberNavController())
}

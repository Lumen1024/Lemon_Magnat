package com.example.lemonmagnat.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lemonmagnat.animation.SlideInAnimation
import com.example.lemonmagnat.screens.game.GameScreen
import com.example.lemonmagnat.screens.menu.MenuScreen
import com.example.lemonmagnat.screens.records.RecordsScreen

@Composable
fun MainNavigator() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "")
    {
        composable(route = Screen.Menu.route)
        {
            SlideInAnimation { MenuScreen() }
        }
        composable(route = Screen.Game.route)
        {
            SlideInAnimation { GameScreen() }
        }
        composable(route = Screen.Records.route)
        {
            SlideInAnimation { RecordsScreen() }
        }
    }
}
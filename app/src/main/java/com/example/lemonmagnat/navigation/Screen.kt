package com.example.lemonmagnat.navigation

sealed class Screen(val route: String) {
    object Menu : Screen(route = "menu_screen")
    object Game : Screen(route = "game_screen")
    object Records : Screen(route = "records_screen")
}
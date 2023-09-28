package com.example.lemonmagnat.screens.menu

sealed class MenuEvent {
    object GoPlay: MenuEvent()
    object GoRecords : MenuEvent()
    object Exit : MenuEvent()
}
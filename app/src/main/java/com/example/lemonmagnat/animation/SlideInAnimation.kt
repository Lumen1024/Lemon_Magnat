package com.example.lemonmagnat.animation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable

@Composable
fun SlideInAnimation(content: @Composable () -> Unit) {
    AnimatedVisibility(
        visible = true,
        enter = slideInHorizontally(
            initialOffsetX = { it },
            animationSpec = tween(500)
        ),
        exit = slideOutHorizontally(
            targetOffsetX = { it },
            animationSpec = tween(500)
        )
    ) {
        content()
    }
}
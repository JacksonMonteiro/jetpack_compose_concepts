package com.example.crashcourse.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    background = DeepBlue,
    surface = DeepBlue,
    onBackground = TextWhite,
    onSurface = TextWhite,
    primary = ButtonBlue
)

@Composable
fun MeditationUITheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}
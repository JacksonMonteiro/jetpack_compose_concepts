package com.example.crashcourse.interfaces.meditationUI

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.crashcourse.ui.theme.MeditationUITheme

class MeditationUIActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MeditationUITheme {
                Scaffold(modifier = Modifier.Companion.fillMaxSize()) { innerPadding ->
                    MeditationUIHomeScreen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}
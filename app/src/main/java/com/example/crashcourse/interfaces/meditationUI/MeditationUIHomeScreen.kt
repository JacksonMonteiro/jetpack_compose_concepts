package com.example.crashcourse.interfaces.meditationUI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.crashcourse.R
import com.example.crashcourse.ui.theme.DeepBlue

@Composable
fun MeditationUIHomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {
        Column {
            GreetingSection()
        }
    }
}

@Composable
fun GreetingSection(name: String = "User") {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(verticalArrangement = Arrangement.Center) {
            Text("Good Morning, $name", style = MaterialTheme.typography.titleMedium)
            Text("We Wish you have a good day!, $name", style = MaterialTheme.typography.bodyMedium)
        }
        Icon(
            painter = painterResource(R.drawable.ic_search),
            contentDescription = "Search Icon",
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
    }
}
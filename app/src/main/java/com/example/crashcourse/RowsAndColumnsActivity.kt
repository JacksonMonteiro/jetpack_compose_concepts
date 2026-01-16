package com.example.crashcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Activity to practice concepts about columns, rows and basic sizing in jetpack compose
 */
class RowsAndColumnsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface {
                Column {
                    ColumnExample()
                    ColumnWithAlignmentExample()

                    RowExample()
                    RowWithAlignmentExample()
                }
            }
        }
    }
}

@Composable
fun ColumnExample() {
    Column() {
        Text("Hello")
        Text("World")
    }
}

@Composable
fun ColumnWithAlignmentExample() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Hello")
        Text("World")
    }
}

@Composable
fun RowExample() {
    Row() {
        Text("Hello")
        Text("World")
    }
}

@Composable
fun RowWithAlignmentExample() {
    Row(
        modifier = Modifier
            .fillMaxWidth(0.5f)
            .height(100.dp)
            .background(Color.Green),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Text("Hello")
        Text("World")
    }
}
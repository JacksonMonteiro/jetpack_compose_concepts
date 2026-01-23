package com.example.crashcourse.concepts

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Activity to practice concepts about Modifiers
 */
class ModifierActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Surface {
                ModifiedColumnExample(this)
            }
        }
    }
}


@Composable
fun ModifiedColumnExample(ctx: Context) {
    Column(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxHeight(0.5F)
            .fillMaxWidth()
            .padding(8.dp)
            .border(5.dp, Color.Magenta)
            .padding(16.dp)
    ) {
        Text("Hello", modifier = Modifier.offset(50.dp))
        Spacer(modifier = Modifier.height(50.dp))
        Text("World", modifier = Modifier.clickable {
            Toast.makeText(ctx, "You clicked in World", Toast.LENGTH_SHORT).show()
        })
    }
}
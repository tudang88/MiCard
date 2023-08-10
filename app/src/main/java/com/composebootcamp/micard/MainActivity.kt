package com.composebootcamp.micard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.composebootcamp.micard.ui.theme.MiCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MiCardApp()
                }
            }
        }
    }
}

@Composable
fun MiCardApp() {
    // column
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(color = Color.Cyan)
    ) {
        // first item
        Image(
            painter = painterResource(id = R.drawable.naruto_profile),
            contentDescription = "profile",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.clip(CircleShape)
                .size(200.dp)
                .border(2.dp, Color.Gray, CircleShape)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MiCardAppPreview() {
    MiCardTheme {
        MiCardApp()
    }
}
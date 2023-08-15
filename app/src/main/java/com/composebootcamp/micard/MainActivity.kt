package com.composebootcamp.micard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.composebootcamp.micard.ui.theme.MiCardTheme
import com.composebootcamp.micard.ui.theme.Typography

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
            modifier = Modifier
                .clip(CircleShape)
                .size(200.dp)
                .border(2.dp, Color.Gray, CircleShape)
        )
        // Use spacer as a margin
        Spacer(modifier = Modifier.height(8.dp))
        // Name title
        Text(
            text = "Naruto Uzumaki",
            color = Color.White,
            style = Typography.titleLarge
        )
        // Position
        Text(
            text = "Shonin Ninja",
            color = Color.LightGray,
            style = Typography.bodyLarge
        )
        // Use spacer as a margin
        Spacer(modifier = Modifier.height(4.dp))
        // Divider
        Divider(
            modifier = Modifier.padding(horizontal = 150.dp, vertical = 10.dp),
            thickness = 2.dp,
            color = Color.White
        )
        // Use spacer as a margin
        Spacer(modifier = Modifier.height(8.dp))
        // Contact number
        ContactBox(iconData = Icons.Default.Phone, content = "+44 123 567 000")
        // Use spacer as a margin
        Spacer(modifier = Modifier.height(8.dp))
        // Contact number
        ContactBox(iconData = Icons.Default.Email, content = "naruto.uzumaki@konoha.com")
    }
}

@Composable
fun ContactBox(iconData: ImageVector, content :String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(color = Color.White)
            .width(250.dp)
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Icon(imageVector = iconData, contentDescription = "Icon", tint = Color.Blue)
        Spacer(modifier = Modifier.width(24.dp))
        Text(text = content, style = TextStyle(
            color = Color.Magenta,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        ))
    }
}

@Preview
@Composable
fun ContactBoxPreview() {
    MiCardTheme {
        ContactBox(iconData = Icons.Default.Phone, content = "+81-1234-5650")
    }
}

@Preview(showBackground = true)
@Composable
fun MiCardAppPreview() {
    MiCardTheme {
        MiCardApp()
    }
}
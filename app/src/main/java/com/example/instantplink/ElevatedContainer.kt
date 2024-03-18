package com.example.instantplink


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.sql.DriverManager.println

//CONTAINER IN JETPACK COMPOSE
@Composable
fun CircleButton(
    imageName: String,
    buttonColor: Color,
    action: () -> Unit
) {
    Surface(
        color = buttonColor,
        shape = RoundedCornerShape(percent = 50),
        modifier = Modifier
            .size(60.dp)
            .padding(8.dp)
            .clickable(onClick = action),
        elevation = 8.dp
    ) {
        Icon(
            imageVector = when (imageName) {
                "magnifyingglass" -> Icons.Default.Search
                "house" -> Icons.Default.Home
                "message" -> Icons.Default.Menu
                "gear" -> Icons.Default.Settings
                else -> Icons.Default.ArrowBack
            },
            contentDescription = null,
            tint = Color.White
        )
    }
}

@Composable
fun Container() {
    Surface(
        color = Color.White,
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(75.dp)
            .padding(horizontal = 16.dp, vertical = 8.dp),
        elevation = 5.dp
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
           modifier = Modifier.fillMaxSize()
        ) {
            CircleButton(
                imageName = "magnifyingglass",
                buttonColor = Color.Gray,
                action = { println("Button 1 tapped") }
            )
            CircleButton(
                imageName = "house",
                buttonColor = Color.Blue,
                action = { println("Button 2 tapped") }
            )
            CircleButton(
                imageName = "message",
                buttonColor = Color.Green,
                action = { println("Button 3 tapped") }
            )
            CircleButton(
                imageName = "gear",
                buttonColor = Color.Red,
                action = { println("Button 4 tapped") }
            )
        }
    }
}

@Preview
@Composable
fun ElevatedContainer() {
    MaterialTheme {
        Container()
    }
}

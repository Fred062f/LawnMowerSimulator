package com.example.lawnmowersimulator

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.Navigation

@Composable
fun WelcomeScreen(navController: NavController) {
    val image = painterResource(R.drawable.lawn_mower_png_photo)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF4E965A)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Lawn Mower Simulator",
            color = Color.White,
            fontSize = 39.sp,
            modifier = Modifier.padding(top = 16.dp),
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        )
        Image(
            painter = image,
            contentDescription = "Lawn Mower",
            alpha = 1f,
            modifier = Modifier
                .size(width = 200.dp, height = 200.dp)
        )
        Text(
            text = "Savner du frodige plæner fra gamle minder",
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 16.dp),
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        )
        Text(
            text = "Så har vi en løsning til dig:",
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 16.dp),
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        )
        Text(
            text = "↓",
            color = Color.White,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        )

        Button(
            onClick = {navController.navigate("Action")},
            modifier = Modifier.padding(top = 16.dp),
        ) {
            Text(
                text = "Play the game",
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic
            )

        }
    }
}

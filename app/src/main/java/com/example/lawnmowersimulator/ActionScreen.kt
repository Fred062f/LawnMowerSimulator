package com.example.lawnmowersimulator

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lawnmowersimulator.ui.theme.LawnMowerSimulatorTheme

@Composable
fun ActionScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(id = R.drawable.wp1950370),
                contentScale = ContentScale.FillBounds
            )
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            GrassClockGrid(grassBlocks = 51)
        }
    }
}

@Composable
fun GrassBlock() {
    Box(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .border(0.5.dp, Color.White)
            .paint(
                painter = painterResource(id = R.drawable.grass),
                contentScale = ContentScale.FillBounds
            )
            .clickable { println("Clicked") }
    )
}

@Composable
fun GrassClockGrid(grassBlocks: Int) {
    LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 125.dp)) {
        items(grassBlocks) {
            GrassBlock()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ActionScreenPreview() {
    LawnMowerSimulatorTheme {
        ActionScreen()
    }
}
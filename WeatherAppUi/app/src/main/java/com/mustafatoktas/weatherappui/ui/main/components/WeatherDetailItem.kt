package com.mustafatoktas.weatherappui.ui.main.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun WeatherDetailItem(
    icon: Int,
    value: String,
    label: String
) {
    Column(
        modifier = Modifier.padding(16.dp).clickable {},
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        AsyncImage(
            model = icon,
            contentDescription = null,
            modifier = Modifier.size(34.dp)
        )
        Text(
            text = value,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center
        )
        Text(
            text = label,
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
}

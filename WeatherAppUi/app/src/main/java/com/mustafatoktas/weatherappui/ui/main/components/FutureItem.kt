package com.mustafatoktas.weatherappui.ui.main.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.mustafatoktas.weatherappui.R
import com.mustafatoktas.weatherappui.domain.model.FutureModel

@Composable
fun FutureItem(
    item: FutureModel
) {
    Row(
        modifier = Modifier
            .clickable {}
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = item.day,
            color = Color.White,
            fontSize = 14.sp
        )

        AsyncImage(
            model = when (item.picPath) {
                "storm" -> R.drawable.storm
                "cloudy" -> R.drawable.cloudy
                "windy" -> R.drawable.windy
                "cloudy_sunny" -> R.drawable.cloudy_sunny
                "sunny" -> R.drawable.sunny
                "rainy" -> R.drawable.rainy
                else -> R.drawable.sunny
            },
            contentDescription = null,
            modifier = Modifier
                .padding(start = 32.dp)
                .size(45.dp)
        )
        Text(
            text = item.status,
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp),
            color = Color.White,
            fontSize = 14.sp
        )
        Text(
            text = "${item.lowTemp}°",
            modifier = Modifier.padding(end = 16.dp),
            color = Color.White,
            fontSize = 14.sp
        )
        Text(
            text = "${item.highTemp}°",
            color = Color.White,
            fontSize = 14.sp
        )
    }
}

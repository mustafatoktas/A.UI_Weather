package com.mustafatoktas.weatherappui.ui.main.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.mustafatoktas.weatherappui.R
import com.mustafatoktas.weatherappui.domain.model.HourlyModel
import com.mustafatoktas.weatherappui.ui.theme.purple

@Composable
fun FutureModel(
    model: HourlyModel
) {
    Column(
        modifier = Modifier
            .clickable {}
            .width(90.dp)
            .wrapContentHeight()
            .padding(4.dp)
            .background(
                color = purple,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = model.hour,
            color = Color.White,
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            textAlign = TextAlign.Center
        )

        AsyncImage(
            model = when (model.picPath) {
                "cloudy" -> R.drawable.cloudy
                "sunny" -> R.drawable.sunny
                "wind" -> R.drawable.wind
                "rainy" -> R.drawable.rainy
                "storm" -> R.drawable.storm
                else -> R.drawable.sunny
            },
            contentDescription = null,
            modifier = Modifier
                .size(45.dp)
                .padding(8.dp),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "${model.temp}°",
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            textAlign = TextAlign.Center
        )
    }
}

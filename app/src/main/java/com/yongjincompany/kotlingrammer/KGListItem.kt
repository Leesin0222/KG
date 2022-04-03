package com.yongjincompany.kotlingrammer

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.yongjincompany.kotlingrammer.data.KG


@Composable
fun KGListItem(kg: KG) {
    Card(
        modifier = Modifier
            .padding(horizontal = 0.dp, vertical = 4.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    )
    {
        Row {
            KGImage(kg = kg)
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = kg.title, style = typography.h6)
                Text(text = "자세히 보기", style = typography.caption)
            }
        }
    }
}

@Composable
private fun KGImage(kg: KG) {
    Image(painter = painterResource(id = kg.KotlinImageId),
          contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(76.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}
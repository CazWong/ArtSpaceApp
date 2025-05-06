package com.example.artspaceapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artspaceapp.R

@Composable
fun ArtworkItem(
    modifier: Modifier = Modifier,
    image: Painter,
    contentDescription: String? = null,
    contentScale: ContentScale = ContentScale.Fit
) {

    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Box(
            modifier = Modifier,
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = image,
                contentDescription = contentDescription,
                modifier = Modifier.padding(
                    top = 16.dp,
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 48.dp
                ),
                contentScale = contentScale
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArtworkItemPreview() {
    ArtworkItem(
        image = painterResource(id = R.drawable.pic_1 ),
        contentDescription = "Picture 1"
    )
}
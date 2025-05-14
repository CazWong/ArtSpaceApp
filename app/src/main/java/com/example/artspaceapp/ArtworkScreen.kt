package com.example.artspaceapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artspaceapp.components.ArtworkInfo
import com.example.artspaceapp.components.ArtworkItem
import com.example.artspaceapp.components.CarouselButtons

@Composable
fun ArtworkScreenLayout(
    modifier: Modifier = Modifier,
    artworkList: List<Artwork>,
) {

    var currentArtworkIndex by rememberSaveable { mutableIntStateOf(0) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 32.dp, bottom = 16.dp, start = 16.dp, end = 16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ArtworkItem(
                image = painterResource(
                    id = artworkList[currentArtworkIndex].artwork
                ),
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        ArtworkInfo(
            title = artworkList[currentArtworkIndex].title,
            location = artworkList[currentArtworkIndex].location,
        )
        Spacer(modifier = Modifier.height(32.dp))
        CarouselButtons(
            currentIndex = currentArtworkIndex,
            artworkList = artworkList,
            onIndexChanged = { newIndex -> currentArtworkIndex = newIndex }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArtworkScreenPreview() {
    ArtworkScreenLayout(artworkList = artworkList)
}

package com.example.artspaceapp

import androidx.annotation.DrawableRes

data class Artwork(
    @DrawableRes val artwork: Int,
    val title: String,
    val location: String
)

val artworkList = listOf(
    Artwork(
        artwork = R.drawable.pic_1,
        title = "Gachapon 'Small Vibrator'",
        location = "Dotonbori, Osaka, Japan"
    ),
    Artwork(
        artwork = R.drawable.pic_2,
        title = "Cherry Blossom Promenade",
        location = "Nakameguro - Tokyo, Japan"
    ),
    Artwork(
        artwork = R.drawable.pic_3,
        title = "Tigers vs Tokyo Giants",
        location = "Tokyo Dome - Tokyo, Japan"
    ),
    Artwork(
        artwork = R.drawable.pic_4,
        title = "Gion at night",
        location = "Gion - Kyoto, Japan"
    ),
    Artwork(
        artwork = R.drawable.pic_5,
        title = "Green light fixture",
        location = "Kanda - Tokyo, Japan"
    ),
    Artwork(
        artwork = R.drawable.pic_6,
        title = "Hermes building",
        location = "Ginza - Tokyo, Japan"
    ),
    Artwork(
        artwork = R.drawable.pic_7,
        title = "Business cards in toilet",
        location = "Dotonbori - Osaka, Japan"
    ),
    Artwork(
        artwork = R.drawable.pic_8,
        title = "Cherry Blossom Viewing Etiquette",
        location = "Nakameguro - Tokyo, Japan"
    ),
    Artwork(
        artwork = R.drawable.pic_9,
        title = "Cup Noodle Museum",
        location = "Osaka, Japan"
    ),
    Artwork(
        artwork = R.drawable.pic_10,
        title = "Face on a stone",
        location = "Kyoto, Japan"
    )
)
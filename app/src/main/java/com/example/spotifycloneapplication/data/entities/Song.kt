package com.example.spotifycloneapplication.data.entities

/**
 * this data class is for parse data from firebase
 */

data class Song(
    val mediaId: String = "",
    val title: String = "",
    val subTitle: String = "",
    val songUrl: String = "",
    val imageUrl: String = ""
)
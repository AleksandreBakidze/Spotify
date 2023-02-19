package com.example.spotifycloneapplication.data.remote

import com.example.spotifycloneapplication.data.entities.Song
import com.example.spotifycloneapplication.other.Constants.SONG_COLLECTION
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class MusicDatabase {
    /**
     * get instance to firestore database collection
     */
    private val firestore = FirebaseFirestore.getInstance()
    private val songCollection = firestore.collection(SONG_COLLECTION)

    /**
     * function that actually get song data from friestore
     * suspend function is for coroutine which use because we make api call and we don't need to make it in main three
     */
    suspend fun getAllSongs(): List<Song> {
        return try {
            songCollection.get().await().toObjects(Song::class.java)
        } catch (e: Exception) {
            emptyList()
        }
    }
}
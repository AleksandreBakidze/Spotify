package com.example.spotifycloneapplication

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * create Application class exm. class SpotifyApplication : Application()
 * give annotation @HiltAndroidApp that mark this class as Application class for dagger-hilt
 */
@HiltAndroidApp
class SpotifyApplication : Application()
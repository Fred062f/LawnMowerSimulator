package com.example.lawnmowersimulator

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel

class ViewModel(private val context: Context) : ViewModel() {

    private val mediaPlayer: MediaPlayer = MediaPlayer.create(context, R.raw.lawnmower)

    fun playSound() {
        if (!mediaPlayer.isPlaying) {
            mediaPlayer.start()
        }
    }

    override fun onCleared() {
        mediaPlayer.release()
        super.onCleared()
    }
}

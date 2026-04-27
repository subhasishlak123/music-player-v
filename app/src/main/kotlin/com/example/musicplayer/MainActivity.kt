package com.example.musicplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var playButton: Button
    private lateinit var pauseButton: Button
    private lateinit var stopButton: Button
    private lateinit var statusText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playButton = findViewById(R.id.play_button)
        pauseButton = findViewById(R.id.pause_button)
        stopButton = findViewById(R.id.stop_button)
        statusText = findViewById(R.id.status_text)

        playButton.setOnClickListener {
            statusText.text = "Now Playing Music..."
        }

        pauseButton.setOnClickListener {
            statusText.text = "Music Paused"
        }

        stopButton.setOnClickListener {
            statusText.text = "Music Stopped"
        }
    }
}

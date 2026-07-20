package com.gooai.generated

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleText = findViewById<TextView>(R.id.titleText)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val btnStop = findViewById<Button>(R.id.btnStop)

        titleText.text = "مرحباً بك في Kofet Music"

        btnPlay.setOnClickListener {
            if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer()
                // في تطبيق حقيقي يتم تحميل مسار ملف صوتي محلي هنا
            }
            mediaPlayer?.start()
        }

        btnStop.setOnClickListener {
            mediaPlayer?.pause()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}
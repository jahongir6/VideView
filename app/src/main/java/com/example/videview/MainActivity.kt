package com.example.videview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    private lateinit var myvideoView: VideoView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myvideoView = findViewById(R.id.vide_vew)
        myvideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.jahongir))
        myvideoView.start()
        myvideoView.setOnClickListener {
            myvideoView.start()
        }
        myvideoView.setOnLongClickListener {
            myvideoView.pause()
            true
        }
    }
}
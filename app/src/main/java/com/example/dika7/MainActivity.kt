package com.example.dika7

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse
                ("https://www.https://www.facebook.com/kha.alonne"))
            startActivity(i)
        })
        button2.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse
                ("https://www.instagram.com/dhika_saktiandhika/?hl=id"))
            startActivity(i)
        })
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.asu)
        button3.setOnClickListener{
            MediaPlayer?.start()
        }
        button4.setOnClickListener{
            MediaPlayer?.pause()
        }
        button5.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}

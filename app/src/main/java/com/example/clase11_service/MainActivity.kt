package com.example.clase11_service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var buttonInit: Button
    private lateinit var buttonStop: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonInit = findViewById(R.id.buttonInit)
        buttonStop = findViewById(R.id.buttonStop)

        buttonInit.setOnClickListener {
            startService(Intent(this@MainActivity, MediaPlayerServices::class.java))
        }

        buttonStop.setOnClickListener {
            stopService(Intent(this@MainActivity, MediaPlayerServices::class.java))
        }
    }
}
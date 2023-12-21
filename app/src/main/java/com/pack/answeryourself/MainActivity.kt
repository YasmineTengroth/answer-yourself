package com.pack.answeryourself

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startAnswerButton = findViewById<Button>(R.id.startAnswerButton)
        val intent =


        startAnswerButton.setOnClickListener {
            startActivity(intent)
            println("hello")
        }
    }
}
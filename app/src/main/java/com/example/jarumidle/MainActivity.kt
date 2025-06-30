package com.example.jarumidle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.jarumidle.model.MessageModel

class MainActivity : AppCompatActivity() {

    private lateinit var model: MessageModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        model = MessageModel("R Kelly")

        val startButton = findViewById<Button>(R.id.buttonStart)
        startButton.setOnClickListener {
            val intent = Intent(this, DifficultyActivity::class.java)
            startActivity(intent)
        }
    }

}
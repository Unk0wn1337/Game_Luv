package com.example.jarumidle.controller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.jarumidle.R
import com.example.jarumidle.model.MainActivityButtonsModel

class PlayerNamesActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_names)
        val continueButton = findViewById<Button>(R.id.buttonContinue)
        continueButton.setOnClickListener {
            val intent = Intent(this, DifficultyActivity::class.java)
            startActivity(intent)
        }
    }


}


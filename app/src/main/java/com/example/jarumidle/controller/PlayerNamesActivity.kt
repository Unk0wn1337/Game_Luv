package com.example.jarumidle.controller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.jarumidle.R
import com.example.jarumidle.model.singleton_model.PlayerNamesModel

class PlayerNamesActivity : AppCompatActivity() {

    private lateinit var editTextName1: EditText
    private lateinit var editTextName2: EditText
    private lateinit var continueButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_names)
        initViews()
        setupListeners()
    }

    private fun initViews() {
        editTextName1 = findViewById(R.id.editTextName1)
        editTextName2 = findViewById(R.id.editTextName2)
        continueButton = findViewById(R.id.buttonContinue)
    }

    private fun setupListeners() {
        continueButton.setOnClickListener {
            if(savePlayerNames()){
                navigateToDifficulty()
            } else {
                println("ez igy nem jo!!")
            }
        }
    }

    private fun savePlayerNames(): Boolean {
        if(editTextName1.text.toString().isBlank() || editTextName2.text.toString().isBlank()){
            return false
        } else {
            PlayerNamesModel.setPlayer1(editTextName1.text.toString())
            PlayerNamesModel.setPlayer2(editTextName2.text.toString())
            return true
        }


    }

    private fun navigateToDifficulty() {

        val intent = Intent(this, DifficultyActivity::class.java)
        startActivity(intent)
    }
    private fun test(){
        println(PlayerNamesModel.getPlayer1())
        println(PlayerNamesModel.getPlayer1())
    }
}

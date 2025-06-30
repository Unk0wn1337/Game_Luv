package com.example.jarumidle.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jarumidle.R
import com.example.jarumidle.model.MainActivityButtonsModel

class MainActivity : AppCompatActivity() {

    private lateinit var startupButtons: MainActivityButtonsModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        intializeMethods()
    }

    fun intializeMethods(){
        ButtonsIntialize()
    }

    private fun ButtonsIntialize() {
        startupButtons = MainActivityButtonsModel(this)
        startupButtons.setupStartButton()
    }

}


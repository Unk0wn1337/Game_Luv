// MainActivityButtonsModel.kt

package com.example.jarumidle.model

import android.app.Activity
import android.content.Intent
import android.widget.Button
import com.example.jarumidle.R
import com.example.jarumidle.controller.DifficultyActivity
import com.example.jarumidle.controller.PlayerNamesActivity

class MainActivityButtonsModel(private val activity: Activity) {

    fun setupStartButton() {
        val startButton = activity.findViewById<Button>(R.id.buttonStart)
        startButton.setOnClickListener {
            val intent = Intent(activity, PlayerNamesActivity::class.java)
            activity.startActivity(intent)
        }
    }
}

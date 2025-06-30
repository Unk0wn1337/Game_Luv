package com.example.jarumidle.model.singleton_model

object PlayerNamesModel {
    private var player1: String = ""
    private var player2: String = ""

    fun setPlayer1(name: String) { player1 = name }
    fun setPlayer2(name: String) { player2 = name }
    fun getPlayer1() = player1
    fun getPlayer2() = player2
}


package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    class Dice(val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }

    private fun rollDice() {
        //cria um objeto dado com 6 lados
        val dice = Dice(6)
        //joga o dado
        val diceRoll = dice.roll()
        //atualiza o valor do dado na tela
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

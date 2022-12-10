package com.example.dicerollapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = getString(R.string.let_roll)
        rollButton.setOnClickListener {
            rollDice()
        }

        diceImage = findViewById(R.id.dice_image)

    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val drawerResource = when (randomInt) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        diceImage.setImageResource(drawerResource)
    }

}
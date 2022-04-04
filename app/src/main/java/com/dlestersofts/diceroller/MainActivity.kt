package com.dlestersofts.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
//        rollButton.text = "Let's Roll";
        rollButton.setOnClickListener{
//            Toast.makeText(this, "Hey clicked!! ", Toast.LENGTH_SHORT).show();
            rollDice()
        }
        diceImage = findViewById(R.id.diceImage1)
    }

    private fun rollDice() {

        val resultText: TextView = findViewById(R.id.textNow)
        val randomInt = java.util.Random().nextInt(6) + 1
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        resultText.text =randomInt.toString()
//        val diceImage: ImageView = findViewById(R.id.diceImage1)
        diceImage.setImageResource(drawableResource)
    }
}
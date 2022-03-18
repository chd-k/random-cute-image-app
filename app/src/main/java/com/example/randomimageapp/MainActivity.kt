package com.example.randomimageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {
    private lateinit var randomImage: ImageView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        randomImage = findViewById(R.id.randomImage)
        button = findViewById(R.id.button)
        button.setOnClickListener { getRandomImageAndColor() }
    }

    private fun getRandomImageAndColor() {
        val id = when ((1..6).random()) {
            1 -> R.drawable.image1
            2 -> R.drawable.image2
            3 -> R.drawable.image3
            4 -> R.drawable.image4
            5 -> R.drawable.image5
            else -> R.drawable.image6
        }
        randomImage.background = ResourcesCompat.getDrawable(resources, id, null)
        val color = when ((1..10).random()) {
            1 -> R.color.random_color1
            2 -> R.color.random_color2
            3 -> R.color.random_color3
            4 -> R.color.random_color4
            5 -> R.color.random_color5
            6 -> R.color.random_color6
            7 -> R.color.random_color7
            8 -> R.color.random_color8
            9 -> R.color.random_color9
            else -> R.color.random_color10
        }
        button.setBackgroundColor(ContextCompat.getColor(this, color))
    }
}
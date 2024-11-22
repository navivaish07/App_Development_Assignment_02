package com.example.assignment2

import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views
        val textView: TextView = findViewById(R.id.textView)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        // Button 1: Change Text
        button1.setOnClickListener {
            textView.text = "Text Changed!"
        }

        // Button 2: Change Height
        button2.setOnClickListener {
            val newHeight = 200 // Set height in pixels
            textView.layoutParams = textView.layoutParams.apply {
                height = newHeight
            }
            textView.requestLayout()
        }

        // Button 3: Center Text
        button3.setOnClickListener {
            val layoutParams = textView.layoutParams as ViewGroup.MarginLayoutParams
            textView.layoutParams = layoutParams
            textView.gravity = Gravity.CENTER
        }
    }
}

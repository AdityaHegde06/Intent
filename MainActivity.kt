package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val btnIntent = findViewById<Button>(R.id.button)

        btnIntent.setOnClickListener {
            //open new activity
            intent= Intent(applicationContext,SecondActivity::class.java)
            startActivity(intent)

        }
    }
}

package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.intent.R.id.button as button


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val btnIntent=findViewById<Button>(button)

        btnIntent.setOnClickListener {
            //open new activity

            intent= Intent(applicationContext,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}

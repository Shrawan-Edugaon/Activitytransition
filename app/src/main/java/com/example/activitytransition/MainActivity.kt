package com.example.activitytransition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.button1) as Button

        btn1.setOnClickListener {
            val intent = Intent(this@MainActivity,Main2Activity::class.java)
            startActivity(intent)
        }
    }
}
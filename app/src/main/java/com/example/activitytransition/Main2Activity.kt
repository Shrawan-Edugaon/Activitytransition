package com.example.activitytransition

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Main2Activity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main2activity)

        val btn2 = findViewById<Button>(R.id.button2) as Button

        btn2.setOnClickListener {
            val intent = Intent(this@Main2Activity,MainActivity::class.java)
            startActivity(intent)
        }
    }

}

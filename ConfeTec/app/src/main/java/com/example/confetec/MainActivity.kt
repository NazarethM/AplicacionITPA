package com.example.confetec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button=findViewById<Button>(R.id.bt1)
        button.setOnClickListener {
            val intent = Intent(this, Activity_menu::class.java)
            startActivity(intent)

        }
    }
}

package com.example.confetec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button;

class Activity_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val buttonInvitados = findViewById<Button>(R.id.bt2)
        buttonInvitados.setOnClickListener {
            val intentInvitados = Intent(this, activity_invitados::class.java)
            startActivity(intentInvitados)
        }

        val buttonAcademicos = findViewById<Button>(R.id.bt4)
          buttonAcademicos.setOnClickListener {
            val intentAcademicos = Intent(this, Activity_academicos::class.java)
            startActivity(intentAcademicos)

            val buttonAlumnos = findViewById<Button>(R.id.bt9)
            buttonAlumnos.setOnClickListener {
                val intentAlumnos = Intent(this, Activity_alumnos::class.java)
                startActivity(intentAlumnos)
            }


            }

        }
    }






package com.example.confetec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import android.widget.Button

private lateinit var conferenciaPlainText: TextView
private lateinit var nombreacademicoPlainTextPlainText: TextView
private lateinit var cargoPlainText: TextView
private var academicoId: Int = 1 // ID de Académico


class Activity_academicos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_academicos)

        academicoId += 1 // Incrementamos el ID
        conferenciaPlainText = findViewById(R.id.edit4)
        nombreacademicoPlainTextPlainText = findViewById(R.id.edit5)
        cargoPlainText = findViewById(R.id.edit6)

        val guardarRegistroButton: Button = findViewById(R.id.bt6)
        guardarRegistroButton.setOnClickListener {

            val nombre: String = conferenciaPlainText.text.toString()
            val lugarResidencia: String = nombreacademicoPlainTextPlainText.text.toString()
            val cargo: String = cargoPlainText.text.toString() // Recupera el valor del campo del cargo


            val mensaje = "Invitado ${academicoId}: Nombre: $nombre, Lugar de residencia: $lugarResidencia, Cargo: $cargo"
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
        }

    }
}
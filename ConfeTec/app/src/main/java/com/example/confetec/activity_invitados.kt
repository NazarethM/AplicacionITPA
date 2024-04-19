package com.example.confetec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.TextView
import android.widget.Button


class activity_invitados : AppCompatActivity() {
    private lateinit var nombrePlainText: TextView
    private lateinit var lugarResidenciaPlainText: TextView
    private var invitadoId: Int = 1 // ID de invitado


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invitados)

        invitadoId += 1 // Incrementamos el ID
        nombrePlainText = findViewById(R.id.edit3)
        lugarResidenciaPlainText = findViewById(R.id.edit2)

        val guardarRegistroButton: Button = findViewById(R.id.bt5)
        guardarRegistroButton.setOnClickListener {

            val nombre: String = nombrePlainText.text.toString()
            val lugarResidencia: String = lugarResidenciaPlainText.text.toString()

            // Mensaje
            val mensaje = "Invitado $invitadoId: Nombre: $nombre, Lugar de residencia: $lugarResidencia"
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
        }
    }
}



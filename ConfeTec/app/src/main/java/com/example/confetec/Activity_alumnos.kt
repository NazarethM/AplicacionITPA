package com.example.confetec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class Activity_alumnos : AppCompatActivity() {
    private var alumnoId: Int = 1 // ID de invitado
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alumnos)

        alumnoId += 1 // Incrementamos el ID
        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val tv1 = findViewById<TextView>(R.id.tv1)
        val button = findViewById<Button>(R.id.bt7)
        val spinner: Spinner = findViewById(R.id.alumnos_spinner)
        val spinner2: Spinner = findViewById(R.id.semestre_spinner)

        ArrayAdapter.createFromResource(
            this,
            R.array.alumnos_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears.
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner.
            spinner.adapter = adapter


            val listaCarreras = arrayOf("Mecatrónica", "TIC's", "Gestión Empresarial", "Logística", "Industrial")
            val adaptadorCarreras = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listaCarreras)
            spinner2.adapter = adaptadorCarreras

            val listaSemestres = (1..10).map { it.toString() }.toTypedArray()
            val adaptadorSemestres = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listaSemestres)
            spinner2.adapter = adaptadorSemestres

            button.setOnClickListener {
                val nombreAlumno = et1.text.toString()
                val numeroControl = et2.text.toString()
                val carreraSeleccionada = spinner.selectedItem.toString()
                val semestreSeleccionado = spinner2.selectedItem.toString()

                val mensaje = "Alumno $alumnoId:Nombre: $nombreAlumno Número de Control: $numeroControl Carrera: $carreraSeleccionada Semestre: $semestreSeleccionado"
                

                // Mostrar un Toast con el mensaje de registro exitoso
                Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show()
            }
        }
    }
        }


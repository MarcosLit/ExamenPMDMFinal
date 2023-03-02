package com.example.examenpmdmfinal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MovieTitleActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_title)

        var titulo = findViewById<EditText>(R.id.titulo)
        var duracion = findViewById<EditText>(R.id.duracion)
        var boton = findViewById<Button>(R.id.button)

        var cambio : Intent

        boton.setOnClickListener(){
            if (titulo.text.isNotEmpty() && duracion.text.isNotEmpty()){
                if (duracion.text.isDigitsOnly() && duracion.text.toString().toInt() > 0){
                    cambio = Intent(this, MovieDetailsActivity::class.java)
                    cambio.putExtra("titulo", titulo.text.toString())
                    cambio.putExtra("duracion", duracion.text.toString())
                    startActivity(cambio)
                }else
                    Toast.makeText(this, "La duracion no puede tener caracteres y debe ser mayor que 0", Toast.LENGTH_SHORT).show()
            }else
                Toast.makeText(this, "Rellene los campos para continuar", Toast.LENGTH_SHORT).show()
        }

    }
}
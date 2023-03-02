package com.example.examenpmdmfinal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MovieDetailsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        var director = findViewById<EditText>(R.id.director)
        var ano = findViewById<EditText>(R.id.año)
        var siguiente = findViewById<Button>(R.id.siguiente2)
        var atras = findViewById<Button>(R.id.atras)

        var titulo = intent.getStringExtra("titulo")
        var duracion = intent.getStringExtra("duracion")

        var cambio : Intent



        atras.setOnClickListener(){
            cambio= Intent(this, MovieTitleActivity::class.java)
            startActivity(cambio)
        }

        siguiente.setOnClickListener(){
            if (director.text.isNotEmpty() and ano.text.isNotEmpty()){
                if (ano.text.isDigitsOnly()){
                    cambio = Intent(this, MovieDisplayActivity::class.java)
                    cambio.putExtra("titulo", titulo)
                    cambio.putExtra("duracion", duracion)
                    cambio.putExtra("director", director.text.toString())
                    cambio.putExtra("año", ano.text.toString())
                    startActivity(cambio)
                }else
                    Toast.makeText(this, "La duracion no puede tener caracteres", Toast.LENGTH_SHORT).show()
            }else
                Toast.makeText(this, "Rellene los campos para continuar", Toast.LENGTH_SHORT).show()
        }
    }
}
package com.example.examenpmdmfinal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MovieDisplayActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_display)

        var vuelta = findViewById<Button>(R.id.vuelta)

        var titulo = intent.getStringExtra("titulo")
        var duracion = intent.getStringExtra("duracion")
        var director = intent.getStringExtra("director")
        var año = intent.getStringExtra("año")

        var tituloMovie = findViewById<TextView>(R.id.tituloMovie)
        var duracionMovie = findViewById<TextView>(R.id.duracionMovie)
        var directorMovie = findViewById<TextView>(R.id.directorMovie)
        var añoMovie = findViewById<TextView>(R.id.añoMovie)




        tituloMovie.text = titulo.toString()
        duracionMovie.text = duracion.toString()
        directorMovie.text = director.toString()
        añoMovie.text = año.toString()


        vuelta.setOnClickListener(){
            var cambio = Intent(this, MovieTitleActivity::class.java)
            startActivity(cambio)
        }

    }
}
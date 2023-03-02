package com.example.examenpmdmfinal

class Movie : java.io.Serializable {
    var titulo : String? = ""
    var duracion : String? = ""
    var director : String? = ""
    var año : String? = ""

    constructor(titulo : String?, duracion : String?, director : String?, año : String?){
        this.titulo = titulo
        this.duracion = duracion
        this.director = director
        this.año = año
    }
}
package com.example.taller03

data class Usuario(
    val nombre: String,
    val apellido: String,
    val email: String,
    val password: String,
    val imagenContacto: String,  // URL de la imagen
    val numeroIdentificacion: String,
    val latitud: Double,
    val longitud: Double,
    val estado: String
)

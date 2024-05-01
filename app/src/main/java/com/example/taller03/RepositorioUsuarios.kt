package com.example.taller03

object RepositorioUsuarios {
    val usuarios: MutableList<Usuario> = mutableListOf()

    fun inicializarUsuarios() {
        usuarios.add(Usuario("Juan", "Pérez", "juan.perez@example.com", "password123", "https://example.com/image1.jpg", "123456789", 40.712776, -74.005974, "Activo"))
        usuarios.add(Usuario("Ana", "López", "ana.lopez@example.com", "password321", "https://example.com/image2.jpg", "987654321", 34.052235, -118.243683, "Inactivo"))
        usuarios.add(Usuario("Carlos", "Martinez", "carlos.martinez@example.com", "password456", "https://example.com/image3.jpg", "192837465", 51.507351, -0.127758, "Activo"))
    }
}

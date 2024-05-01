package com.example.taller03

import android.util.Log
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

object RepositorioUsuarios {
    val usuarios: MutableList<Usuario> = mutableListOf()
    var onDataReady: (() -> Unit)? = null

    fun inicializarUsuarios() {
        val database = Firebase.database
        val myRef = database.getReference(PATH_USERS)

        myRef.get().addOnSuccessListener { dataSnapshot ->
            if (dataSnapshot.exists()) {
                usuarios.clear()
                for (userSnapshot in dataSnapshot.children) {
                    val usuario = userSnapshot.getValue(Usuario::class.java)
                    usuario?.let {
                        usuarios.add(it)
                    }
                }
                onDataReady?.invoke()
            } else {
                Log.e("Firebase", "No users found")
            }
        }.addOnFailureListener { exception ->
            Log.e("Firebase", "Error getting user data", exception)
        }
    }
}
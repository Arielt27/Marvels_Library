package com.example.marvelslibrary

import android.os.Bundle
import android.view.View
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun continuar(view: View)
    {
        val intent = Intent(this, Activity2::class.java)

        startActivity(intent)
    }


    fun Buscar(view: View)
    {

    }

    fun NuevaBusqueda(view: View)
    {

    }


}
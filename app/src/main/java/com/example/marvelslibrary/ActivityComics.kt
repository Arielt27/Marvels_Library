package com.example.marvelslibrary

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityComics : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screencomics)
    }


    fun BuscarComic(view: View)
    {
        val intent = Intent(this, ActivityComic::class.java)

        startActivity(intent)
    }

    fun NuevaBusqueda(view: View)
    {
        val intent = Intent(this, ActivityComics::class.java)

        startActivity(intent)
    }
}
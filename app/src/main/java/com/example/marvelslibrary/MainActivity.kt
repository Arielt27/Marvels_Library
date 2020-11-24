package com.example.marvelslibrary

import android.os.Bundle
import android.view.View
import android.content.Intent
import android.os.Vibrator
import android.util.Log
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()
{
    private lateinit var vib: Vibrator

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun continuar(view: View)
    {
        val intent = Intent(this, Activity2::class.java)

        startActivity(intent)

        vib = getSystemService(VIBRATOR_SERVICE) as Vibrator

        if(vib!!.hasVibrator())
        {
            val tiempo: Long = 50
            vib!!.vibrate(tiempo)
        }
    }


    fun Buscar(view: View)
    {

    }

    fun NuevaBusqueda(view: View)
    {

    }


}
package com.example.marvelslibrary

import android.os.Bundle
import android.view.View
import android.content.Intent
import android.os.Vibrator
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.marvelslibrary.repo.CharactersRepo
import com.example.marvelslibrary.service.CharacterDataWrapper
import com.example.marvelslibrary.service.CharacterService

class MainActivity : AppCompatActivity() {


    private lateinit var vib: Vibrator


    val singleToneList: SingleToneClass = SingleToneClass.instance


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun continuar(view: View) {
        val intent = Intent(this, Activity2::class.java)

        startActivity(intent)

        vib = getSystemService(VIBRATOR_SERVICE) as Vibrator

        if (vib!!.hasVibrator()) {
            val tiempo: Long = 50
            vib!!.vibrate(tiempo)
        }
    }


    fun BuscarPj(view: View) {
        var nombrePj: EditText = findViewById(R.id.editTextTextPersonName)
        var personaje = nombrePj.text



    }


    fun BuscarComic(view: View) {

    }

    fun NuevaBusqueda(view: View) {

    }

    class SingleToneClass private constructor() {
        var data: List<CharacterDataWrapper.CharacterDataContainer.Character>? = null

        companion object {
            val instance = SingleToneClass()
        }


    }
}
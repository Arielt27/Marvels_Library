package com.example.marvelslibrary

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.marvelslibrary.Api.Interfaz.CharactersApi
import com.example.marvelslibrary.Api.Model.Characters
import com.example.marvelslibrary.Api.RestEngine
import org.jetbrains.anko.doAsync
import retrofit2.*



class ActivityCharacter : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_personajes)
    }

    fun llamarServicio(view: View)
    {
        val llamadaInterfaz: CharactersApi = RestEngine.getRestEngine().create(CharactersApi::class.java)
        val resultado: Call<Characters> = llamadaInterfaz.getCharacters()

        doAsync{
            resultado.enqueue(object : retrofit2.Callback<Characters>
            {
                override fun onResponse(call: Call<Characters>, response: Response<Characters>)
                {
                    if (response.isSuccessful) {
                        var personajes: Characters? = response.body()
                        println("Funciona")
                    } else {
                        println("No funciona")
                        Log.i("TAG","ERROR")
                    }
                }

                override fun onFailure(call: Call<Characters>, t: Throwable)
                {
                    Log.e("ERROR", "Error al conectar")
                }

            })
        }

        val intent = Intent(this, ActivityPersonaje::class.java)

        startActivity(intent)
    }


    fun NuevaBusqueda(view: View)
    {
        val intent = Intent(this, ActivityCharacter::class.java)

        startActivity(intent)
    }
}





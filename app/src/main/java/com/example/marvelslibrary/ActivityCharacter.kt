package com.example.marvelslibrary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ActivityCharacter : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_personajes)
    }

    private fun getRetrofit(): Retrofit
    {
        return Retrofit.Builder()
            .baseUrl("http(s)://gateway.marvel.com/bd34039f11dd5094fed60836a02359b4")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    //val service = retrofit.create(CharacterService::class.java)
}
package com.example.marvelslibrary.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface CharacterService {
    @GET("characters")
    fun listCharacters(): retrofit2.Call<CharactersResponse>

    companion object
    {
        val instance : CharacterService by lazy{
            val retrofit = Retrofit.Builder().baseUrl("http://gateway.marvel.com/v1/public/")
                .addConverterFactory(GsonConverterFactory.create()).build()
            retrofit.create(CharacterService::class.java)
        }

    }
}
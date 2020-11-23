package com.example.marvelslibrary.service

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


interface CharacterService {
    @GET("v1/public/characters?")
    fun listCharacters(
        @Query("apikey") apikey: String,
        @Query("hash") hash: String,
        @Query("ts") ts: String
    ): Call<CharacterDataWrapper>

    companion object
    {
        val instance : CharacterService by lazy{
            val retrofit = Retrofit.Builder().baseUrl("http://gateway.marvel.com/")
                .addConverterFactory(GsonConverterFactory.create()).build()
            retrofit.create(CharacterService::class.java)
        }

    }
}
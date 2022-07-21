package com.example.marvelslibrary.service

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


interface CharacterService
{
    @GET("characters?")
    fun listCharacters(
        @Query("apikey") apikey: String,
        @Query("hash") hash: String,
        @Query("ts") ts: String
    ): Call<CharacterDataWrapper>

    @GET("comics?")
    fun listComics(
        @Query("apikey")apikey: String,
        @Query("hash") hash: String,
        @Query("ts") ts: String
    ) : Call<ComicDataWrapper>

    companion object
    {
        val instance : CharacterService by lazy{
            val retrofit = Retrofit.Builder().baseUrl("https://gateway.marvel.com/v1/public/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofit.create<CharacterService>(CharacterService::class.java)
        }

    }
}
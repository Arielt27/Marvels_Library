package com.example.marvelslibrary.service

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*


interface CharacterService {
    @GET("characters{apikey}{hash}{ts}")
    fun listCharacters(@Query("apikey") apikey: String, @Query("hash") hash:String,@Query("ts") ts:String): Call<CharacterDataWrapper.CharacterDataContainer>

    companion object
    {
        val instance : CharacterService by lazy{
            val retrofit = Retrofit.Builder().baseUrl("http://gateway.marvel.com/v1/public/")
                .addConverterFactory(GsonConverterFactory.create()).build()
            retrofit.create(CharacterService::class.java)
        }

    }
}
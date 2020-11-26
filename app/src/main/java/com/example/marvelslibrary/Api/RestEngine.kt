package com.example.marvelslibrary.Api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RestEngine
{
    companion object
    {
        fun getRestEngine(): retrofit2.Retrofit
        {
            val retrofit = Retrofit.Builder()
                .baseUrl(
                        "http://gateway.marvel.com/v1/public/characters?apikey=bd34039f11dd5094fed60836a02359b4&hash=11f720d99b00745927692524dc0079d3&ts=1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit
        }
    }
}


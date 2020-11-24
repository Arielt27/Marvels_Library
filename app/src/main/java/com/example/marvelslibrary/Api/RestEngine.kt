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
                .baseUrl("http(s)://gateway.marvel.com/98eeebf435a8d433d8ab06a7dd3c9bfa")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit
        }
    }
}


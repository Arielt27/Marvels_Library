package com.example.marvelslibrary.Api.Interfaz


import retrofit2.http.GET
import com.example.marvelslibrary.Api.Model.Characters as Characters1

interface CharactersApi
{
    @GET("/v1/public/characters")
    fun getCharacters(): retrofit2.Call<Characters1>
}

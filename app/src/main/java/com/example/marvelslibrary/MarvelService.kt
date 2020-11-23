package com.example.marvelslibrary

import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

public interface MarvelService
{
    @GET("/v1/public/characters")
    fun getAllCharacters(): retrofit2.Call<List<Characters>>

    @GET("/v1/public/characters/{characterId}")
    fun getCharacterId(@Path("characterId")characterId:Int): retrofit2.Call<List<Characters>>

    @POST("/v1/public/characters/{characterId}")
    fun postId(@Path("characterId")characterId:Int): retrofit2.Call<List<Characters>>

}
package com.example.marvelslibrary.repo

import com.example.marvelslibrary.service.CharacterDataWrapper
import com.example.marvelslibrary.service.CharacterService
import com.example.marvelslibrary.service.ComicDataWrapper
import retrofit2.Call
import retrofit2.Response

class ComicsRepo(private val characterService: CharacterService)
{

    var apikey = "bd34039f11dd5094fed60836a02359b4"
    var hash = "11f720d99b00745927692524dc0079d3"
    var ts = "1"

    fun listComics(callBack: (List<ComicDataWrapper.ComicDataContainer.Comic>?)-> Unit)
    {
        val comicCall = characterService.listComics(apikey,hash,ts)
        comicCall.enqueue(object: retrofit2.Callback<ComicDataWrapper>
        {
            override fun onResponse(
                call: Call<ComicDataWrapper>,
                response: Response<ComicDataWrapper>
            )
            {
                println("succes")
                val body: ComicDataWrapper? = response?.body()
                callBack(body?.data?.results)
            }

            override fun onFailure(call: Call<ComicDataWrapper>, t: Throwable)
            {
                println("failure")
                callBack(null)
            }
        })
    }
}
package com.example.marvelslibrary.repo

import com.example.marvelslibrary.service.CharacterService
import com.example.marvelslibrary.service.CharacterDataWrapper
import retrofit2.Call
import retrofit2.Response

class CharactersRepo(private val characterService:CharacterService)
{

    var apikey = "bd34039f11dd5094fed60836a02359b4"
    var hash = "11f720d99b00745927692524dc0079d3"
    var ts = "1"

    fun listCharacters(callBack: (List<CharacterDataWrapper.CharacterDataContainer.Character>?)-> Unit)
    {
        val characterCall = characterService.listCharacters(apikey,hash,ts)
        characterCall.enqueue(object: retrofit2.Callback<CharacterDataWrapper>
        {
            override fun onResponse(
                call: Call<CharacterDataWrapper>,
                response: Response<CharacterDataWrapper>
            )
            {
                val body: CharacterDataWrapper? = response?.body()
                callBack(body?.data?.results)
            }

            override fun onFailure(call: Call<CharacterDataWrapper>, t: Throwable)
            {
                callBack(null)
            }
        })
    }
}
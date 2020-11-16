package com.example.marvelslibrary.repo

import com.example.marvelslibrary.service.CharacterService
import com.example.marvelslibrary.service.CharacterDataWrapper
import retrofit2.Call
import retrofit2.Response

class CharactersRepo(private val characterService:CharacterService){

    var apikey = "bd34039f11dd5094fed60836a02359b4"
    var hash = "11f720d99b00745927692524dc0079d3"
    var ts = "1"

    fun listCharacters(callBack: (List<CharacterDataWrapper.Character>?)-> Unit)
    {
        val characterCall = characterService.listCharacters(apikey,hash,ts)
        characterCall.enqueue(object: retrofit2.Callback<CharacterDataWrapper.CharacterDataContainer>
        {
            override fun onResponse(
                call: Call<CharacterDataWrapper.CharacterDataContainer>,
                response: Response<CharacterDataWrapper.CharacterDataContainer>
            )
            {
                val body: CharacterDataWrapper.CharacterDataContainer? = response?.body()
                callBack(body?.results)
            }

            override fun onFailure(call: Call<CharacterDataWrapper.CharacterDataContainer>, t: Throwable) {
                callBack(null)
            }

        })
    }
}
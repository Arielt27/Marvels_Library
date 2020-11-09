package com.example.marvelslibrary.repo

import android.net.DnsResolver
import com.example.marvelslibrary.service.CharacterService
import com.example.marvelslibrary.service.CharactersResponse
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class CharactersRepo(private val characterService:CharacterService){

    fun listCharacters(callBack: (List<CharactersResponse.Character>?)-> Unit)
    {
        val characterCall = characterService.listCharacters()
        characterCall.enqueue(object: retrofit2.Callback<CharactersResponse>
        {
            override fun onResponse(
                call: Call<CharactersResponse>,
                response: Response<CharactersResponse>
            )
            {
                val body: CharactersResponse? = response?.body()
                callBack(body?.results)
            }

            override fun onFailure(call: Call<CharactersResponse>, t: Throwable) {
                callBack(null)
            }

        })
    }
}
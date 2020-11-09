package com.example.marvelslibrary

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.marvelslibrary.repo.CharactersRepo
import com.example.marvelslibrary.service.CharacterService
import com.example.marvelslibrary.service.CharactersResponse

class MainActivity : AppCompatActivity()
{


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TAG = javaClass.simpleName

        var charactersList:List<CharactersResponse.Character> = listOf<CharactersResponse.Character>()
        val characterService : CharacterService = CharacterService.instance
        val characterRepo = CharactersRepo(characterService);

        characterRepo.listCharacters {
            if(it != null)
            {
                Log.i(TAG,"resultado = $it")
                charactersList = it
            }
        }


        setContentView(R.layout.screen2)
    }

    fun Heroes(view: View)
    {
        setContentView(R.layout.screenheroes)

    }

    fun Villanos(view: View)
    {
        setContentView(R.layout.villains_screen)

    }

    fun Anti(view: View)
    {
        setContentView(R.layout.antiheroes_screen)

    }

    fun Comics(view: View)
    {
        setContentView(R.layout.comics_screen)

    }

    fun Buscar(view: View)
    {

    }

    fun Regresar(view: View)
    {
        setContentView(R.layout.screen2)


    }

    fun NuevaBusqueda(view: View)
    {

    }
}
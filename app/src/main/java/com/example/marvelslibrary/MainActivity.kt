package com.example.marvelslibrary

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.marvelslibrary.repo.CharactersRepo
import com.example.marvelslibrary.service.CharacterService
import com.example.marvelslibrary.service.CharacterDataWrapper
import kotlinx.android.synthetic.main.screenheroes.*

class MainActivity : AppCompatActivity()
{
    lateinit var rcvCharacter : RecyclerView


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TAG = javaClass.simpleName

        var charactersList:List<CharacterDataWrapper.Character> = listOf<CharacterDataWrapper.Character>()
        val characterService : CharacterService = CharacterService.instance
        val characterRepo = CharactersRepo(characterService);

        characterRepo.listCharacters {
            if(it != null)
            {
                Log.i(TAG,"resultado = $it")
                charactersList = it
            }
        }

        println(charactersList.size)

        setContentView(R.layout.screenheroes)

        rcvCharacter = rcvPjs
        rcvCharacter.layoutManager = LinearLayoutManager(this)
        rcvCharacter.adapter = CharacterListRecycleViewAdapter()
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
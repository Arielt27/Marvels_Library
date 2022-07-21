package com.example.marvelslibrary

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.marvelslibrary.repo.CharactersRepo
import com.example.marvelslibrary.service.CharacterDataWrapper
import com.example.marvelslibrary.service.CharacterService
import kotlinx.android.synthetic.main.screen_personajes.*
//import com.example.marvelslibrary.Api.Model.Characters
import org.jetbrains.anko.doAsync
import retrofit2.*



class ActivityCharacter : AppCompatActivity()
{
    lateinit var rcvCharacter:RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_personajes)

        val characterService: CharacterService = CharacterService.instance
        val characterRepo = CharactersRepo(characterService);
        val characterListAdapter = CharacterListRecycleViewAdapter()

        val TAG = javaClass.simpleName

        characterRepo.listCharacters {
            if (it != null) {
                 Log.i(TAG, "resultado = $it")
                    characterListAdapter.listaCharacters = it
                    characterListAdapter.notifyDataSetChanged()
                }
            }

            rcvCharacter = rcvPjs
            rcvCharacter.layoutManager = LinearLayoutManager(this)
            rcvCharacter.adapter = characterListAdapter
        }

    fun NuevaBusqueda(view: View)
    {
        val intent = Intent(this, ActivityCharacter::class.java)
        startActivity(intent)

    }
}








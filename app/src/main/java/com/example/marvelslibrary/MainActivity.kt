package com.example.marvelslibrary

import android.os.Bundle
import android.view.View
import android.content.Intent
import android.os.Vibrator
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.marvelslibrary.repo.CharactersRepo
import com.example.marvelslibrary.service.CharacterDataWrapper
import com.example.marvelslibrary.service.CharacterService

class MainActivity : AppCompatActivity()
{
    private lateinit var vib: Vibrator

    var comicList:List<CharacterDataWrapper.CharacterDataContainer.Comic> = listOf<CharacterDataWrapper.CharacterDataContainer.Comic>()
    var characterList:List<CharacterDataWrapper.CharacterDataContainer.Character> = listOf<CharacterDataWrapper.CharacterDataContainer.Character>()



    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val characterService : CharacterService = CharacterService.instance
        val characterRepo = CharactersRepo(characterService)

        val TAG = javaClass.simpleName

        characterRepo.listCharacters {
            if(it != null)
            {
                Log.i(TAG,"resultado = $it")
                characterList = it
                for (i in 0..characterList.size-1)
                {
                    println(characterList[i].name)
                }
            }else
            {
                Log.i(TAG,"resultado = $it")

            }
        }





    }

    fun continuar(view: View)
    {
        val intent = Intent(this, Activity2::class.java)

        startActivity(intent)

        vib = getSystemService(VIBRATOR_SERVICE) as Vibrator

        if(vib!!.hasVibrator())
        {
            val tiempo: Long = 50
            vib!!.vibrate(tiempo)
        }
    }


    fun BuscarPj(view: View)
    {
        var textView:EditText = findViewById(R.id.editTextTextPersonName)
        var personaje = textView.text

        println(personaje)

        for(i in 0..characterList.size-1)
        {
            if (personaje.equals(characterList[i].name))
            {
                val intent = Intent(this, CharacterScreenActivity::class.java)
                startActivity(intent)
            }
        }


    }
    fun BuscarComic(view: View)
    {
        var textView:EditText = findViewById(R.id.editTextTextPersonName)
        var comicName = textView.text

        println(comicName)

        for(i in 0..characterList.size-1)
        {
            if (comicName.equals(comicList[i].title))
            {
                val intent = Intent(this, ComicScreenActivity::class.java)
                startActivity(intent)
            }
        }


    }

    fun NuevaBusqueda(view: View)
    {

    }


}
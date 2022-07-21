package com.example.marvelslibrary

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.marvelslibrary.repo.ComicsRepo
import com.example.marvelslibrary.service.CharacterService

class ActivityComic : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_comic)

        val TAG = javaClass.simpleName

        val comicService: CharacterService = CharacterService.instance
        val comicRepo = ComicsRepo(comicService);
        val characterListAdapter = CharacterListRecycleViewAdapter()

        println("hoa")
        comicRepo.listComics {
            if (it != null) {
                Log.i(TAG, "resultado = $it")
                //characterListAdapter.listaCharacters = it
                characterListAdapter.notifyDataSetChanged()
            }else{
                println("null")}
        }
    }
}
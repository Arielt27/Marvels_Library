package com.example.marvelslibrary

import android.os.Bundle
import android.view.View
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.screen_personajes.*

class Activity2 : AppCompatActivity()
{

    lateinit var  rcvCharacter: RecyclerView
    var list:MainActivity.SingleToneClass = MainActivity.SingleToneClass.instance



    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen2)
    }



    fun Comics(view: View)
    {
        val intent = Intent(this, ActivityComic::class.java)

        startActivity(intent)
    }

    fun Character(view: View)
    {
        val intent = Intent(this, ActivityCharacter::class.java)

        startActivity(intent)
    }



}
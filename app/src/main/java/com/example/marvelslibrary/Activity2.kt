package com.example.marvelslibrary

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen2)
    }


    fun Heroes(view: View)
    {
        val intent = Intent(this, ActivityHeroes::class.java)


        startActivity(intent)
    }

    fun Villanos(view: View)
    {
        val intent = Intent(this, ActivityVillanos::class.java)


        startActivity(intent)
    }

    fun Anti(view: View)
    {
        val intent = Intent(this, ActivityAntiheroes::class.java)


        startActivity(intent)
    }

    fun Comics(view: View)
    {
        val intent = Intent(this, ActivityComics::class.java)


        startActivity(intent)
    }

}
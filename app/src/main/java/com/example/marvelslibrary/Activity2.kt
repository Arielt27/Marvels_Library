package com.example.marvelslibrary

import android.os.Bundle
import android.view.View
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen2)
    }


    fun Character(view: View)
    {
        val intent = Intent(this, ActivityCharacter::class.java)

        startActivity(intent)
    }

    fun Comics(view: View)
    {
        val intent = Intent(this, ActivityComics::class.java)

        startActivity(intent)
    }





}
package com.example.marvelslibrary

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.find

class CharacterListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

    val characterName : TextView = itemView.findViewById<TextView>(R.id.txtViewHolder)
    val characterPic : ImageView = itemView.findViewById(R.id.characterPic)

}

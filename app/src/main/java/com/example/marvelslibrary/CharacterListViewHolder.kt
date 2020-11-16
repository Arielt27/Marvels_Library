package com.example.marvelslibrary

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CharacterListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

    val characterName : TextView = itemView.findViewById<TextView>(R.id.txtViewHolder)

}

package com.example.marvelslibrary

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.marvelslibrary.service.CharacterDataWrapper

class CharacterListRecycleViewAdapter : RecyclerView.Adapter<CharacterListViewHolder>() {

    var listaCharacters:List<CharacterDataWrapper.CharacterDataContainer.Character> = listOf<CharacterDataWrapper.CharacterDataContainer.Character>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_view_holder,parent,false)
        return CharacterListViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharacterListViewHolder, position: Int) {
        holder.characterName.text = listaCharacters[position].name
    }

    override fun getItemCount(): Int {
        return listaCharacters.size
    }

}

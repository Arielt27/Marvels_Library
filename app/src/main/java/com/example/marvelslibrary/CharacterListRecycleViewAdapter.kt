package com.example.marvelslibrary

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CharacterListRecycleViewAdapter : RecyclerView.Adapter<CharacterListViewHolder>() {

    val listaPrueba:List<String> = listOf<String>("hola","q","hace")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_view_holder,parent,false)
        return CharacterListViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharacterListViewHolder, position: Int) {
        holder.characterName.text = listaPrueba[position]
    }

    override fun getItemCount(): Int {
        return listaPrueba.size
    }

}

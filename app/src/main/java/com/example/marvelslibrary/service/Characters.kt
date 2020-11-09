package com.example.marvelslibrary.service

import android.media.Image

data class CharactersResponse(
    val count:Int,
    val offset:Int,
    val limit:Int,
    val total:Int,
    val results:List<Character>
) {
    class Character(
        val name:String,
        val description:String,
        val resourceURL:String,
        val thumbnail:Image,
        val comics:ComicList
    ){}
    class Image(
        val path:String,
        val extension:String
    ) {}
    class ComicList(
        val available:Int,
        val collectionURl:String,
        val items:List<ComicSummary>
    )
    {}
    class ComicSummary (
        val resourceURI:String,
        val name:String
    )
    {}

}
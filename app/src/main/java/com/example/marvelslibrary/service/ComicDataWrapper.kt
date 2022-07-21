package com.example.marvelslibrary.service

import java.util.*

data class ComicDataWrapper(
    val code:Int,
    val status:String,
    val copyright:String,
    val attributionText:String,
    val attributionHTML:String,
    val etag:String,
    val data:ComicDataContainer
) {
    data class ComicDataContainer(
        val offset: Int,
        val limit: Int,
        val total: Int,
        val count: Int,
        val results: List<Comic>
    )
    {
        class Comic(
            val id:Int,
            val digitalId:Int,
            val title:String,
            val issueNumber:Double,
            val variantDescription:String,
            val description:String,
            val modified: Date,
            val isbn:String,
            val upc:String,
            val diamondCode:String,
            val ean:String,
            val issn:String,
            val format:String,
            val pageCount:Int,
            val textObjects:Array<TextObject>,
            val resourceURI:String,
            val urls:Array<Url>,
            val series: SeriesSummary,
            val variants:Array<ComicSummary>,
            val collections:Array<ComicSummary>,
            val collectedIssues:Array<ComicSummary>,
            val dates:Array<ComicDate>,
            val prices:Array<ComicPrice>,
            val thumbnail: Image,
            val images:Array<Image>,
            val creators: CreatorList,
            val characters: CharacterList,
            val stories: StoryList,
            val events: EventList
        )
        {}
        class TextObject(
            val type:String,
            val language:String,
            val text:String)
        {}
        class Url(
            val type:String,
            val url:String )
        {}
        class SeriesSummary (
            val resourceURI:String,
            val name:String)
        {}

        class ComicSummary(
            val resourceURI: String,
            val name: String
        ) {}

        class ComicDate(
            val type:String,
            val date:Date)
        {}

        class ComicPrice (
            val type:String,
            val price:Float
        ) {}

        class CreatorList (
            val available:Int,
            val returned:Int,
            val collectionURI:String,
            val items:Array<CreatorSummary>
        ){}

        class CreatorSummary (
            val resourceURI:String,
            val name:String,
            val role:String
        ){}

        class CharacterList (
            val available:Int,
            val returned:Int,
            val collectionURI:String,
            val items:Array<CharacterSummary>
        ) {}

        class CharacterSummary (
            val resourceURI:String,
            val name:String,
            val role:String
        ){}

        class StoryList (
            val available:Int,
            val returned:Int,
            val collectionURI:String,
            val items:Array<StorySummary>
        ){}

        class StorySummary (
            val resourceURI:String,
            val name:String,
            val type:String
        ){}

        class EventList (
            val available:Int,
            val returned:Int,
            val collectionURI:Int,
            val items:Array<EventSummary>
        ){}

        class EventSummary(
            val resourceURI:String,
            val name:String
        ) {}

        class Image(
            val path: String,
            val extension: String
        ) {}
    }


}
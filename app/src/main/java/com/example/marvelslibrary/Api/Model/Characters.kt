package com.example.marvelslibrary.Api.Model

import android.media.Image

class Character: ArrayList<Characters>()

data class Characters(
    var id: Int = 0,
    var name: String,
    var thumbnail: Image
)

/*MODELO DE DATOS DE API MARVEL
}
            "id": 1009268,
            "name": "Deadpool",
            "description": "",
            "modified": "2020-04-04T19:02:15-0400",
            "thumbnail":
            "path": "http://i.annihil.us/u/prod/marvel/i/mg/9/90/5261a86cacb99",
            "extension": "jpg"
}*/
package com.miguel.pokedex.data

import retrofit2.http.Query

data class Pokemon(
    val order: Int,
    val name: String,
    val sprites: Sprites,
    val types: Types

) {
    class Sprites(
        val front_default: String
    )
    class Types(
        val types: Array<Type>
        ){
        class Type(
            type: String
        )
    }

}
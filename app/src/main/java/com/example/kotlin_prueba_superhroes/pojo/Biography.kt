package com.example.kotlin_prueba_superhroes.pojo

data class Biography(val fullName: String,
                     val alterEgos: String,
                     val aliases: List<String>,
                     val placeOfBirth: String,
                     val firstAppearance: String,
                     val publisher: String,
                     val alignment: String)
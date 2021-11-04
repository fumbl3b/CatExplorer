package com.example.catexplorer.model.cat


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Weight(
    val imperial: String,
    val metric: String
)
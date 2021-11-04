package com.example.catexplorer.model.cat


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Cat(
    val approved: Int,
    @Json(name = "breed_ids")
    val breedIds: String,
    val breeds: List<Breed>,
    @Json(name = "created_at")
    val createdAt: String,
    val height: Int,
    val id: String,
    @Json(name = "original_filename")
    val originalFilename: String,
    val pending: Int,
    val rejected: Int,
    @Json(name = "sub_id")
    val subId: String,
    val url: String,
    val width: Int
)
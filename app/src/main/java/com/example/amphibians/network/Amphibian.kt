package com.example.amphibians.network
import com.squareup.moshi.Json
data class Amphibian(
    @Json(name = "title") val title: String,
    @Json(name = "primaryImage") val primaryImage: String,
    @Json(name = "period") val period :  String,
    @Json(name = "artistDisplayName") val artistDisplayName :  String,
    @Json(name = "artistNationality") val artistNationality :  String,
    @Json(name = "medium") val medium :  String
)

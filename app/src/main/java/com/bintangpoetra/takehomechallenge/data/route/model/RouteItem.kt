package com.bintangpoetra.takehomechallenge.data.route.model

import com.google.gson.annotations.SerializedName

data class RouteItem(
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("name")
    val name: String
)

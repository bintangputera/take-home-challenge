package com.bintangpoetra.takehomechallenge.data.driver.model

import com.google.gson.annotations.SerializedName

data class DriverItem(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)

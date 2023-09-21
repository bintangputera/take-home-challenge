package com.bintangpoetra.takehomechallenge.data.lib

import com.bintangpoetra.takehomechallenge.data.driver.model.DriverItem
import com.bintangpoetra.takehomechallenge.data.route.model.RouteItem
import com.google.gson.annotations.SerializedName

data class BaseResponse(
    @SerializedName("drivers")
    val drivers: List<DriverItem>,
    @SerializedName("routes")
    val routes: List<RouteItem>
)

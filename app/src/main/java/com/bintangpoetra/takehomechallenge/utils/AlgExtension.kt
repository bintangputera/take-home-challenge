package com.bintangpoetra.takehomechallenge.utils

import com.bintangpoetra.takehomechallenge.data.route.model.RouteItem

fun List<RouteItem>.getRouteInformation(id: String): RouteItem {
    val route = this.filter {
        it.id == id
    }
    return if (route.isNotEmpty()) {
        route.first()
    } else if (id.toInt() % 2 == 0) {
        this.filterRouteByType("R").first()
    } else if (id.toInt() % 5 == 0) {
        this.filterRouteByType("C")[1]
    } else {
        this.filterRouteByType("I").last()
    }
}

fun List<RouteItem>.filterRouteByType(type: String): List<RouteItem> {
    return this.filter {
        it.type == type
    }
}
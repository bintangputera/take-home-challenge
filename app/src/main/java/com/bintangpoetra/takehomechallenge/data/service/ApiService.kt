package com.bintangpoetra.takehomechallenge.data.service

import com.bintangpoetra.takehomechallenge.data.lib.BaseResponse
import retrofit2.http.GET

interface ApiService {

    @GET("data")
    suspend fun getContentData(): BaseResponse

}
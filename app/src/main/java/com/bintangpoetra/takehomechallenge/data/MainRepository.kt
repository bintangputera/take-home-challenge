package com.bintangpoetra.takehomechallenge.data

import com.bintangpoetra.takehomechallenge.data.lib.ApiResponse
import com.bintangpoetra.takehomechallenge.data.lib.BaseResponse
import kotlinx.coroutines.flow.Flow

interface MainRepository {

    fun getContentData(): Flow<ApiResponse<BaseResponse>>

}
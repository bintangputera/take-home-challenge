package com.bintangpoetra.takehomechallenge.domain

import com.bintangpoetra.takehomechallenge.data.lib.ApiResponse
import com.bintangpoetra.takehomechallenge.data.lib.BaseResponse
import kotlinx.coroutines.flow.Flow

interface MainUseCase {

    fun getContentData(): Flow<ApiResponse<BaseResponse>>

}
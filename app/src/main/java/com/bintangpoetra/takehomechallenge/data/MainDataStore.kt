package com.bintangpoetra.takehomechallenge.data

import com.bintangpoetra.takehomechallenge.data.lib.ApiResponse
import com.bintangpoetra.takehomechallenge.data.lib.BaseResponse
import com.bintangpoetra.takehomechallenge.data.service.ApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainDataStore(
    private val service: ApiService
): MainRepository {

    override fun getContentData(): Flow<ApiResponse<BaseResponse>> = flow {
        try {
            emit(ApiResponse.Loading)
            val response = service.getContentData()

            emit(ApiResponse.Success(response))
        } catch (ex: Exception) {
            emit(ApiResponse.Error(ex.message.toString()))
        }
    }

}
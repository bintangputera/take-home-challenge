package com.bintangpoetra.takehomechallenge.domain

import com.bintangpoetra.takehomechallenge.data.MainRepository
import com.bintangpoetra.takehomechallenge.data.lib.ApiResponse
import com.bintangpoetra.takehomechallenge.data.lib.BaseResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class MainInteractor(
    private val repository: MainRepository
): MainUseCase {
    override fun getContentData(): Flow<ApiResponse<BaseResponse>> {
        return repository.getContentData().flowOn(Dispatchers.IO)
    }

}
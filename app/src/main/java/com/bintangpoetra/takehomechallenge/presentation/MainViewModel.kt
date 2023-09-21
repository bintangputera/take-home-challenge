package com.bintangpoetra.takehomechallenge.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bintangpoetra.takehomechallenge.data.lib.ApiResponse
import com.bintangpoetra.takehomechallenge.data.lib.BaseResponse
import com.bintangpoetra.takehomechallenge.domain.MainUseCase
import kotlinx.coroutines.launch

class MainViewModel(
    private val mainUseCase: MainUseCase
): ViewModel() {

    private val _contentDataList = MutableLiveData<ApiResponse<BaseResponse>>()
    val contentDataList: LiveData<ApiResponse<BaseResponse>> get() = _contentDataList

    fun getContentData() {
        viewModelScope.launch {
            mainUseCase.getContentData().collect {
                _contentDataList.value = it
            }
        }
    }

}
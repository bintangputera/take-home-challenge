package com.bintangpoetra.takehomechallenge

import android.content.Intent
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.bintangpoetra.takehomechallenge.base.BaseActivity
import com.bintangpoetra.takehomechallenge.data.lib.ApiResponse
import com.bintangpoetra.takehomechallenge.databinding.ActivityMainBinding
import com.bintangpoetra.takehomechallenge.presentation.MainViewModel
import com.bintangpoetra.takehomechallenge.presentation.detail.DetailActivity
import com.bintangpoetra.takehomechallenge.presentation.driver.DriverAdapter
import com.bintangpoetra.takehomechallenge.utils.getRouteInformation
import org.koin.android.ext.android.inject

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val viewModel: MainViewModel by inject()

    override fun getViewBinding(inflater: LayoutInflater): ActivityMainBinding =
        ActivityMainBinding.inflate(inflater)

    override fun initIntent() {
    }

    override fun initUI() {
    }

    override fun initAction() {
    }

    override fun initProcess() {
        viewModel.getContentData()
    }

    override fun initObservers() {
        viewModel.contentDataList.observe(this) { result ->
            when(result) {
                is ApiResponse.Loading -> {}
                is ApiResponse.Success -> {
                    val driverAdapter = DriverAdapter(result.data.drivers, onClick = {
                        val selectedRoute = result.data.routes.getRouteInformation(it.id)
                        val intentToDetail = Intent(this, DetailActivity::class.java)
                        intentToDetail.putExtra("type", selectedRoute.type)
                        intentToDetail.putExtra("name", selectedRoute.name)
                        startActivity(intentToDetail)
                    })
                    binding.rvDriver.apply {
                        layoutManager = LinearLayoutManager(this@MainActivity)
                        adapter = driverAdapter
                    }
                }
                else -> {
                }
            }
        }
    }

}
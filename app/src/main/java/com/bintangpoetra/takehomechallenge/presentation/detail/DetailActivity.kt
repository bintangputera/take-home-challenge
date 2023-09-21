package com.bintangpoetra.takehomechallenge.presentation.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bintangpoetra.takehomechallenge.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var _activityDetailBinding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _activityDetailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(_activityDetailBinding.root)
    }
}
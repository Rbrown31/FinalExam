package com.cna.mobileprogramming.movieBuff.repository

import com.cna.mobileprogramming.movieBuff.service.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {

    suspend fun getAllMovies() = retrofitService.getAllMovies()
}
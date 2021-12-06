package com.example.day4

import retrofit2.http.GET

interface HttpApiService {
    @GET("/books")
    suspend fun getBooks(): List<ResponseResult>

}
package com.example.restapis_retrofit.networking

import com.example.restapis_retrofit.model.JokeResponse
import retrofit2.Response
import retrofit2.http.GET

interface JokeAPIService {
    @GET("joke/Any")
    suspend fun getRandomJoke(): Response<JokeResponse>
}
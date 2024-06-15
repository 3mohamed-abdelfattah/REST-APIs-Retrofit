package com.example.restapis_retrofit.networking

import com.example.restapis_retrofit.model.JokeResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface JokeAPIService {
    @GET("joke/Any")
    fun getRandomJoke(): Single<JokeResponse>
}
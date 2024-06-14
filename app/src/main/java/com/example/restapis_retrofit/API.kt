package com.example.restapis_retrofit

import com.example.restapis_retrofit.model.JokeResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface JokeAPIService {
    @GET("joke/Any")
    fun getRandomJoke(): Call<JokeResponse>
}

object API {

    private val Base_URL = "https://v2.jokeapi.dev/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(Base_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val API_SERVICE = retrofit.create(JokeAPIService::class.java)
}
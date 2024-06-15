package com.example.restapis_retrofit.networking

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


object API {

    private val Base_URL = "https://v2.jokeapi.dev/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(Base_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .build()
    val API_SERVICE = retrofit.create(JokeAPIService::class.java)
}
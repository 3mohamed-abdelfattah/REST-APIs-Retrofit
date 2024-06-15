package com.example.restapis_retrofit

import com.example.restapis_retrofit.model.JokeResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface JokeAPIService {
    @GET("joke/Any")
    fun getRandomJoke(): Single<JokeResponse>
}

object API {

    private val Base_URL = "https://v2.jokeapi.dev/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(Base_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .build()
    val API_SERVICE = retrofit.create(JokeAPIService::class.java)
}
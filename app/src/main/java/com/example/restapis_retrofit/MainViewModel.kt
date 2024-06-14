package com.example.restapis_retrofit

import androidx.lifecycle.ViewModel
import com.example.restapis_retrofit.model.JokeResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {


    init {
        getRandomJoke()
    }

    private fun getRandomJoke() {
        API.API_SERVICE.getRandomJoke().enqueue(object : Callback<JokeResponse> {
            override fun onResponse(p0: Call<JokeResponse>, p1: Response<JokeResponse>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(p0: Call<JokeResponse>, p1: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }

}
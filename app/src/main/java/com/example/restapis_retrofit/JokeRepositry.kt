package com.example.restapis_retrofit

import com.example.restapis_retrofit.networking.API

class JokeRepositry {
    suspend fun getRandomJoke() = API.API_SERVICE.getRandomJoke()
}
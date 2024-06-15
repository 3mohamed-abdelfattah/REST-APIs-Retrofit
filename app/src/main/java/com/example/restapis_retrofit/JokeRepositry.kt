package com.example.restapis_retrofit

import com.example.restapis_retrofit.model.JokeResponse
import com.example.restapis_retrofit.networking.API
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class JokeRepositry {
    suspend fun getRandomJoke(): Flow<JokeResponse?> {
        return flow {
            emit(
                API.API_SERVICE.getRandomJoke().body()
            )
        }
    }
}
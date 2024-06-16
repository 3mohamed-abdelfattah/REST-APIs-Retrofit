package com.example.restapis_retrofit

import com.example.restapis_retrofit.model.JokeResponse
import com.example.restapis_retrofit.model.State
import com.example.restapis_retrofit.networking.API
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class JokeRepositry {
    suspend fun getRandomJoke(): Flow<State<JokeResponse?>> {
        return flow {
            emit(State.Loading)
            try {
                val result = API.API_SERVICE.getRandomJoke()
                if (result.isSuccessful) {
                    emit(State.Success(result.body()))
                } else {
                    emit(State.Error(result.message()))
                }
            } catch (e: Exception) {
                emit(State.Error(e.message.toString()))
            }
        }
    }
}
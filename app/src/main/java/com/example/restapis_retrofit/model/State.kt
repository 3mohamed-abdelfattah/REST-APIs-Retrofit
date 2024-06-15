package com.example.restapis_retrofit.model

sealed class State<out T> {
    data class Success<T>(val data: T) : State<T>()
    data class Error(val message: String) : State<Nothing>()
    object loading : State<Nothing>()
}
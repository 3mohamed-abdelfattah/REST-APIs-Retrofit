package com.example.restapis_retrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restapis_retrofit.model.JokeResponse
import com.example.restapis_retrofit.model.State
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val joke = MutableLiveData<State<JokeResponse?>>()

    val repository = JokeRepositry()

    init {
        getRandomJoke()
    }

    fun getRandomJoke() {
        viewModelScope.launch {
            repository.getRandomJoke().collect {
                joke.postValue(it)
            }
        }
    }

}
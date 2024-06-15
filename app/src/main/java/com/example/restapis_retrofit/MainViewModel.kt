package com.example.restapis_retrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restapis_retrofit.model.JokeResponse
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val joke = MutableLiveData<JokeResponse>()

    val repository = JokeRepositry()

    init {
        getRandomJoke()
    }

    private fun getRandomJoke() {
        viewModelScope.launch {
            joke.postValue(repository.getRandomJoke())
        }
    }

}
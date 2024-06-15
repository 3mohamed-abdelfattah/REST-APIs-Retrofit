package com.example.restapis_retrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.restapis_retrofit.model.JokeResponse
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {

    val joke = MutableLiveData<JokeResponse>()

    init {
        getRandomJoke()
    }

    private fun getRandomJoke() {
        API.API_SERVICE.getRandomJoke()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                joke.postValue(it)
                },
                {

                })

    }

}
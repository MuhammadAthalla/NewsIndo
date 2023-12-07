package com.example.indonews.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.indonews.data.network.ApiConfig
import com.example.newsindo.core.response.NewsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsRepository {
    private val _AntaraTerbaru = MutableLiveData<NewsResponse>()
    val AntaraTerbaru: LiveData<NewsResponse> = _AntaraTerbaru

    private val _AntaraPolitik = MutableLiveData<NewsResponse>()
    val AntaraPolitik: LiveData<NewsResponse> = _AntaraPolitik

    private val _AntaraHukum = MutableLiveData<NewsResponse>()
    val AntaraHukum: LiveData<NewsResponse> = _AntaraHukum

    private val _CNBCBTerbaru = MutableLiveData<NewsResponse>()
    val CNBCTerbaru: LiveData<NewsResponse> = _CNBCBTerbaru

    private val _CNBCNews = MutableLiveData<NewsResponse>()
    val CNBCNews: LiveData<NewsResponse> = _CNBCNews

    private val _CNBCMarket = MutableLiveData<NewsResponse>()
    val CNBCMarket: LiveData<NewsResponse> = _CNBCMarket

    private val _CNNTerbaru = MutableLiveData<NewsResponse>()
    val CNNTerbaru: LiveData<NewsResponse> = _CNNTerbaru

    private val _CNNNasional = MutableLiveData<NewsResponse>()
    val CNNNasional: LiveData<NewsResponse> = _CNNNasional

    private val _CNNInternasional = MutableLiveData<NewsResponse>()
    val CNNInternasional: LiveData<NewsResponse> = _CNNInternasional



    fun getAntaraTerbaru(){

        ApiConfig.provideApiService.getAntaraTerbaru()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _AntaraTerbaru.postValue(response.body())
                            Log.d("test",response.body().toString())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getAntaraPolitik(){

        ApiConfig.provideApiService.getAntaraPolitik()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _AntaraPolitik.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getAntaraHukum(){

        ApiConfig.provideApiService.getAntaraHukum()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _AntaraHukum.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getCNBCTerbaru(){

        ApiConfig.provideApiService.getCNBCterbaru()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _CNBCBTerbaru.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getCNBCNews(){

        ApiConfig.provideApiService.getCNBCNews()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _CNBCNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getCNBCMarket(){

        ApiConfig.provideApiService.getCNBCMarcet()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _CNBCMarket.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }
    fun getCNNTerbaru(){

        ApiConfig.provideApiService.getCNNTerbaru()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _CNNTerbaru.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }
    fun getCNNNasional(){

        ApiConfig.provideApiService.getCNNNasional()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _CNNNasional.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }
    fun getCNNInternasional(){

        ApiConfig.provideApiService.getCNNInternasional()
            .enqueue(object : Callback<NewsResponse> {

                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {

                    if (response.isSuccessful){
                        val responseBody = response.body()
                        if (responseBody != null){
                            _CNNInternasional.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }


}
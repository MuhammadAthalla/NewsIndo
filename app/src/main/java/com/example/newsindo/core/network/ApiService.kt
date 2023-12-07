package com.example.indonews.data.network


import com.example.newsindo.core.response.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("antara/terbaru/")
    fun getAntaraTerbaru(
    ): Call<NewsResponse>

    @GET("antara/politik/")
    fun getAntaraPolitik(
    ): Call<NewsResponse>


    @GET("antara/hukum/")
    fun getAntaraHukum(
    ): Call<NewsResponse>


    @GET("cnbc/terbaru/")
    fun getCNBCterbaru(
    ): Call<NewsResponse>


    @GET("cnbc/news/")
    fun getCNBCNews(

    ): Call<NewsResponse>

    @GET("cnbc/market/")
    fun getCNBCMarcet(
    ): Call<NewsResponse>

    @GET("cnn/terbaru/")
    fun getCNNTerbaru(
    ): Call<NewsResponse>

    @GET("cnn/nasional/")
    fun getCNNNasional(
    ): Call<NewsResponse>

    @GET("cnn/internasional/")
    fun getCNNInternasional(
    ): Call<NewsResponse>

}
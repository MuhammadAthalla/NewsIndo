package com.example.newsindo.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.indonews.data.repository.NewsRepository
import com.example.newsindo.core.response.NewsResponse


class NewsViewModel(private val repository: NewsRepository) : ViewModel(){
    val getAntaraTerbaru: LiveData<NewsResponse> = repository.AntaraTerbaru
    val getAntaraPolitik: LiveData<NewsResponse> = repository.AntaraPolitik
    val getAntaraHukum: LiveData<NewsResponse> = repository.AntaraHukum
    val getCNBCTerbaru: LiveData<NewsResponse> = repository.CNBCTerbaru
    val getCNBCNews: LiveData<NewsResponse> = repository.CNBCNews
    val getCNBCMarket: LiveData<NewsResponse> = repository.CNBCMarket
    val getCNNTerbaru: LiveData<NewsResponse> = repository.CNNTerbaru
    val getCNNNasional: LiveData<NewsResponse> = repository.CNNNasional
    val getCNNInternasional: LiveData<NewsResponse> = repository.CNNInternasional



    fun getAntaraTerbaru() {
        repository.getAntaraTerbaru()
    }


    fun getAntaraPolitik() {
        repository.getAntaraPolitik()
    }


    fun getAntaraHukum() {
        repository.getAntaraHukum()
    }


    fun getCNBCTerbaru() {
        repository.getCNBCTerbaru()
    }
    fun getCNBCNews() {
        repository.getCNBCNews()
    }
    fun getCNBCMarket() {
        repository.getCNBCMarket()
    }
    fun getCNNTerbaru() {
        repository.getCNNTerbaru()
    }
    fun getCNNNasional() {
        repository.getCNNNasional()
    }
    fun getCNNInternasional() {
        repository.getCNNInternasional()
    }





}
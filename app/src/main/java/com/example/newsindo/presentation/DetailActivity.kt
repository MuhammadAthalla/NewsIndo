package com.example.newsindo.presentation

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.newsindo.core.response.PostsItem
import com.example.newsindo.databinding.ActivityDetailBinding
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    companion object {
        const val DATA_NEWS = "data_news"
        const val DATE_NEWS = "date_news"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dataNews = intent.getParcelableExtra<PostsItem>(DATA_NEWS)
        val date = intent.getStringExtra(DATE_NEWS)
        setupMyXML(dataNews, date)
        setupWebView(dataNews)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = "News Detail"
        }

    }

    private fun setupWebView(dataNews: PostsItem?) {
        val webSetting = binding.wvDetail.settings
        webSetting.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW

        binding.wvDetail.webViewClient = object:WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                binding.loadingView.root.visibility = View.VISIBLE
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                binding.loadingView.root.visibility = View.GONE
            }
        }
        dataNews?.link?.let { binding.wvDetail.loadUrl(it) }
    }

    private fun setupMyXML(dataNews: PostsItem?, date: String?) {
        binding.apply {
            detailSource.text = dataNews?.description
            detailTitle.text = dataNews?.title
            detailPublishedAt.text = date

            Picasso.get()
                .load(dataNews?.thumbnail)
                .fit()
                .centerInside()
                .into(detailImage)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}
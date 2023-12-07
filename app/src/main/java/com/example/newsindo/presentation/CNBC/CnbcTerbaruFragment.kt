package com.example.newsindo.presentation.CNBC

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.indonews.data.repository.NewsRepository
import com.example.newsindo.R
import com.example.newsindo.adapter.NewsAdapter
import com.example.newsindo.databinding.FragmentCnbcMarketBinding
import com.example.newsindo.databinding.FragmentCnbcTerbaruBinding
import com.example.newsindo.databinding.FragmentTerbaruBinding
import com.example.newsindo.presentation.NewsViewModel
import com.example.newsindo.utils.NewsViewModelFactory

class CnbcTerbaruFragment : Fragment() {
    private lateinit var binding: FragmentCnbcTerbaruBinding
    private val newsViewModel: NewsViewModel by viewModels{
        NewsViewModelFactory(NewsRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        binding = FragmentCnbcTerbaruBinding.inflate(layoutInflater)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        newsViewModel.getCNBCTerbaru()
        val mAdapter = NewsAdapter()

        newsViewModel.getCNBCTerbaru.observe(viewLifecycleOwner){ news ->
            mAdapter.setData(news.data!!.posts)
            binding.rvCnbc.apply {
                adapter = mAdapter
                layoutManager = LinearLayoutManager(requireContext())
            }
        }


    }
    }
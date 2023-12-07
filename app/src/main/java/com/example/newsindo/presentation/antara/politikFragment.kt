package com.example.newsindo.presentation.antara

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
import com.example.newsindo.databinding.FragmentTerbaruBinding
import com.example.newsindo.presentation.NewsViewModel
import com.example.newsindo.utils.NewsViewModelFactory

class politikFragment : Fragment() {

    private lateinit var binding: FragmentTerbaruBinding
    private val newsViewModel: NewsViewModel by viewModels{
        NewsViewModelFactory(NewsRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        binding = FragmentTerbaruBinding.inflate(layoutInflater)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        newsViewModel.getAntaraPolitik()
        val mAdapter = NewsAdapter()

        newsViewModel.getAntaraPolitik.observe(viewLifecycleOwner){ news ->
            mAdapter.setData(news.data!!.posts)
            binding.rvAntara.apply {
                adapter = mAdapter
                layoutManager = LinearLayoutManager(requireContext())
            }
        }


    }

}
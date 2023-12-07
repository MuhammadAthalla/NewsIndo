package com.example.newsindo.presentation.CNN

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
import com.example.newsindo.databinding.FragmentCnbcTerbaruBinding
import com.example.newsindo.presentation.NewsViewModel
import com.example.newsindo.utils.NewsViewModelFactory

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CnnTerbaruFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CnnTerbaruFragment : Fragment() {
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

        newsViewModel.getCNNTerbaru()
        val mAdapter = NewsAdapter()

        newsViewModel.getCNNTerbaru.observe(viewLifecycleOwner){ news ->
            mAdapter.setData(news.data!!.posts)
            binding.rvCnbc.apply {
                adapter = mAdapter
                layoutManager = LinearLayoutManager(requireContext())
            }
        }


    }
}
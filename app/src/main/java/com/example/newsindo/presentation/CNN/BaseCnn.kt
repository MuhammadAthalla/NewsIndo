package com.example.newsindo.presentation.CNN

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newsindo.R
import com.example.newsindo.adapter.AdapterCnbc
import com.example.newsindo.adapter.AdapterCnn
import com.example.newsindo.databinding.FragmentBaseCnbcBinding
import com.example.newsindo.databinding.FragmentBaseCnnBinding
import com.google.android.material.tabs.TabLayoutMediator

class BaseCnn : Fragment() {



    private lateinit var binding: FragmentBaseCnnBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBaseCnnBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = binding.vpNews
        recyclerView.adapter = AdapterCnn(this)

        val tabList = arrayOf(
            "Terbaru",
            "Nasional",
            "Internasional"
        )

        TabLayoutMediator(binding.tabs, recyclerView) {tab, position ->
            tab.text = tabList[position]
        }.attach()
    }
}
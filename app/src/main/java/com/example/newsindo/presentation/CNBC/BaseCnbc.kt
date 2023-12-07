package com.example.newsindo.presentation.CNBC

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newsindo.R
import com.example.newsindo.adapter.AdapterAntara
import com.example.newsindo.adapter.AdapterCnbc
import com.example.newsindo.databinding.FragmentBaseAntaraBinding
import com.example.newsindo.databinding.FragmentBaseCnbcBinding
import com.google.android.material.tabs.TabLayoutMediator

class BaseCnbc : Fragment() {

    private lateinit var binding: FragmentBaseCnbcBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBaseCnbcBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = binding.vpNews
        recyclerView.adapter = AdapterCnbc(this)

        val tabList = arrayOf(
            "Terbaru",
            "Market",
            "News"
        )

        TabLayoutMediator(binding.tabs, recyclerView) {tab, position ->
            tab.text = tabList[position]
        }.attach()
    }

}
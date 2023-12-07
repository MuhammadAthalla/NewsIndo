package com.example.newsindo.presentation.antara

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newsindo.adapter.AdapterAntara
import com.example.newsindo.databinding.FragmentBaseAntaraBinding
import com.google.android.material.tabs.TabLayoutMediator

class BaseAntara : Fragment() {

    private lateinit var binding: FragmentBaseAntaraBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBaseAntaraBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = binding.vpNews
        recyclerView.adapter = AdapterAntara(this)

        val tabList = arrayOf(
            "Terbaru",
            "Politik",
            "Hukum"
        )

        TabLayoutMediator(binding.tabs, recyclerView) {tab, position ->
            tab.text = tabList[position]
        }.attach()
    }

}
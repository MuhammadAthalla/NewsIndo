package com.example.newsindo.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newsindo.presentation.antara.BaseAntara

import com.example.newsindo.presentation.antara.hukumFragment
import com.example.newsindo.presentation.antara.politikFragment
import com.example.newsindo.presentation.antara.terbaruFragment

class AdapterAntara(fa: BaseAntara) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
       return when(position){
               0 -> terbaruFragment()
               1 -> hukumFragment()
               2 -> politikFragment()
           else -> terbaruFragment()
       }
    }
}
package com.example.newsindo.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newsindo.presentation.CNN.BaseCnn
import com.example.newsindo.presentation.CNN.CnnInternationalFragment
import com.example.newsindo.presentation.CNN.CnnNasionalFragment
import com.example.newsindo.presentation.CNN.CnnTerbaruFragment
import com.example.newsindo.presentation.antara.BaseAntara
import com.example.newsindo.presentation.antara.hukumFragment
import com.example.newsindo.presentation.antara.politikFragment
import com.example.newsindo.presentation.antara.terbaruFragment

class AdapterCnn(fa: BaseCnn) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> CnnTerbaruFragment()
            1 -> CnnNasionalFragment()
            2 -> CnnInternationalFragment()
            else -> CnnTerbaruFragment()
        }
    }
}
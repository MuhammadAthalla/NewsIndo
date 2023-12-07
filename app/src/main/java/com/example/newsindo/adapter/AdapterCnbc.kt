package com.example.newsindo.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newsindo.presentation.CNBC.BaseCnbc
import com.example.newsindo.presentation.CNBC.CnbcMarketFragment
import com.example.newsindo.presentation.CNBC.CnbcNewsFragment
import com.example.newsindo.presentation.CNBC.CnbcTerbaruFragment


class AdapterCnbc(fa: BaseCnbc) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> CnbcTerbaruFragment()
            1 -> CnbcMarketFragment()
            2 -> CnbcNewsFragment()
            else -> CnbcTerbaruFragment()
        }
    }
}
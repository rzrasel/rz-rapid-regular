package com.rzrasel.viewpagerfragmentpageradapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

//class CustomPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
class CustomPagerAdapter(activity: FragmentActivity?): FragmentStateAdapter(activity!!) {
    private val mFragmentList: MutableList<Fragment> = ArrayList()
    private val mFragmentTitleList: MutableList<String> = ArrayList()
    //
    public fun getTabTitle(position : Int): String {
        return mFragmentTitleList[position]
    }

    fun addFragment(fragment: Fragment, title: String) {
        mFragmentList.add(fragment)
        mFragmentTitleList.add(title)
    }

    override fun getItemCount(): Int {
        return mFragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return mFragmentList[position]
    }
}

//https://stackoverflow.com/questions/56778106/fragmentpageradapter-deprecated
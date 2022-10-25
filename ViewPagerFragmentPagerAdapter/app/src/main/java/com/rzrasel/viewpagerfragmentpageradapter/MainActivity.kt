package com.rzrasel.viewpagerfragmentpageradapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var sysViewPager: ViewPager2
    //
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //
        //sysViewPager = findViewById<View>(R.id.sysViewPager) as ViewPager2
        sysViewPager = findViewById<View>(R.id.sysViewPager) as ViewPager2
        //
        val adapter = CustomPagerAdapter(this)
        /*adapter.addFragment(FirstFragment(), "Category")
        adapter.addFragment(FirstFragment(), "Brand")*/
        adapter.addFragment(FirstFragment.newInstance(1, "First Fragment"), "Category")
        adapter.addFragment(FirstFragment.newInstance(2, "Second Fragment"), "Brand")
        //
        sysViewPager.adapter = adapter
        sysViewPager.currentItem = 0
    }
}

//https://guides.codepath.com/android/viewpager-with-fragmentpageradapter
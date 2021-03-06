package com.example.index

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter=ViewPagerAdapter(supportFragmentManager)
        findViewById<ViewPager>(R.id.viewPaper).adapter=adapter
    }
}

class ViewPagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm){
    override fun getItem(position:Int): Fragment {
        return when(position){
            0 -> FirstFragment()
            1 -> SecondFragment()
            else -> ThirdFragment()
        }
    }
    override fun getCount():Int{
        return 3
    }
}
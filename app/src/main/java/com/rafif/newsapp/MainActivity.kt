package com.rafif.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.rafif.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        binding.vvNews.adapter = SectionPagerAdapter(this)

        val tabList = arrayOf("All News", "Top", "Popular")
        TabLayoutMediator(binding.tabs,binding.vvNews){tab, position ->
            tab.text = tabList[position]
        }.attach()
    }
}
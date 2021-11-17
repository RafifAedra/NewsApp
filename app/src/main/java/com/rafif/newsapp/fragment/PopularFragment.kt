package com.rafif.newsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.rafif.newsapp.data.DataNews
import com.rafif.newsapp.adapter.NewsAdapter
import com.rafif.newsapp.bindNewsHeadline
import com.rafif.newsapp.databinding.FragmentPopularBinding

class PopularFragment : Fragment() {

    lateinit var binding: FragmentPopularBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPopularBinding.inflate(inflater, container, false)

        binding.rvPopularNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataPopularNews)
        }


        bindNewsHeadline(binding.newsHeadline, 1)

        return binding.root
    }


}
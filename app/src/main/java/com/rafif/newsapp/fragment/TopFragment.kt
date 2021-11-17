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
import com.rafif.newsapp.databinding.FragmentTopBinding

class TopFragment : Fragment() {

    lateinit var binding: FragmentTopBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTopBinding.inflate(inflater, container, false)

        binding.rvTopNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataTopNews)
        }

        bindNewsHeadline(binding.newsHeadline, 2)

        return binding.root
    }


}
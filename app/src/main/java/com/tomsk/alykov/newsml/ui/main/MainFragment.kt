package com.tomsk.alykov.newsml.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tomsk.alykov.newsml.R
import com.tomsk.alykov.newsml.databinding.FragmentDetailsBinding
import com.tomsk.alykov.newsml.databinding.FragmentFavoriteBinding
import com.tomsk.alykov.newsml.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val mBinding get() = _binding!!
    private val mBinding2 get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

}
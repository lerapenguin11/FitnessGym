package com.example.fitnessgym.presentation.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fitnessgym.R
import com.example.fitnessgym.databinding.FragmentSecondOnBoardingBinding
import com.example.fitnessgym.presentation.HomeFragment
import com.example.fitnessgym.presentation.MainActivity
import com.example.fitnessgym.utilits.replaceFragmentMain

class SecondOnBoardingFragment : Fragment() {
    private var _binding : FragmentSecondOnBoardingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondOnBoardingBinding.inflate(inflater, container, false)

        binding.btNext.setOnClickListener { replaceFragmentMain(HomeFragment()) }

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        (activity as MainActivity).hideBottomNavigationView()
    }
}
package com.example.fitnessgym.presentation.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fitnessgym.R
import com.example.fitnessgym.databinding.FragmentFirstOnBoardingBinding
import com.example.fitnessgym.presentation.MainActivity
import com.example.fitnessgym.utilits.replaceFragmentMain

class FirstOnBoardingFragment : Fragment() {
    private var _binding : FragmentFirstOnBoardingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstOnBoardingBinding.inflate(inflater, container, false)

        binding.btNext.setOnClickListener { replaceFragmentMain(SecondOnBoardingFragment()) }

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        (activity as MainActivity).hideBottomNavigationView()
    }
}
package com.example.fitnessgym.presentation

import android.annotation.SuppressLint
import android.graphics.Outline
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewOutlineProvider
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.domoin.entities.Sports
import com.example.fitnessgym.R
import com.example.fitnessgym.databinding.FragmentHomeBinding
import com.example.fitnessgym.presentation.adapter.PopularAdapter
import com.example.fitnessgym.presentation.adapter.TopAdapter
import com.example.fitnessgym.presentation.adapter.listener.PopularListener
import com.example.fitnessgym.presentation.adapter.listener.TopListener
import com.example.fitnessgym.utilits.getDialogDetails
import com.example.fitnessgym.viewModel.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment(),
                PopularListener,
                TopListener{
    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModel<HomeViewModel>()
    private val topAdapter = TopAdapter(this)
    private val popularAdapter = PopularAdapter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        observeTopData()
        observePopularData()

        return binding.root
    }

    private fun observePopularData() {
        binding.rvPopular.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.rvPopular.adapter = popularAdapter
        popularAdapter.setItem(viewModel.getResultPopular())
    }

    private fun observeTopData() {
        binding.rvTop.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvTop.adapter = topAdapter
        topAdapter.setItem(viewModel.getResultTop())
    }

    override fun onResume() {
        super.onResume()
        (activity as MainActivity).showBottomNavigationView()
    }

    @SuppressLint("ObsoleteSdkInt")
    override fun setIconPopular(imageView: ImageView) {
        imageView.post {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                val radius = resources.getDimensionPixelSize(R.dimen.image_corner_radius).toFloat()
                val outlineProvider = object : ViewOutlineProvider() {
                    override fun getOutline(view: View?, outline: Outline?) {
                        outline?.setRoundRect(0, 0, view!!.width, view.height, radius)
                    }
                }
                imageView.outlineProvider = outlineProvider
                imageView.clipToOutline = true
            }
        }
    }

    override fun popularDetails(popular: Sports) {
        getDialogDetails(requireContext(), popular, resources)
    }

    override fun topDetails(top: Sports) {
        getDialogDetails(requireContext(), top, resources)
    }
}
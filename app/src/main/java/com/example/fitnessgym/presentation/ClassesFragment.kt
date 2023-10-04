package com.example.fitnessgym.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.domoin.entities.Sports
import com.example.fitnessgym.databinding.FragmentClassesBinding
import com.example.fitnessgym.presentation.adapter.ClassesAdapter
import com.example.fitnessgym.presentation.adapter.listener.ClassesListener
import com.example.fitnessgym.utilits.getDialogDetails
import com.example.fitnessgym.viewModel.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ClassesFragment : Fragment(),
                        ClassesListener{
    private var _binding : FragmentClassesBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModel<HomeViewModel>()
    private val classesAdapter = ClassesAdapter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentClassesBinding.inflate(inflater, container, false)

        observeClassesData()

        return binding.root
    }

    private fun observeClassesData() {
        binding.rvClasses.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.rvClasses.adapter = classesAdapter
        classesAdapter.setItem(viewModel.getResultClasses())
    }

    override fun onResume() {
        super.onResume()
        (activity as MainActivity).showBottomNavigationView()
    }

    override fun classesDetails(classes: Sports) {
        getDialogDetails(requireContext(), classes, resources)
    }
}
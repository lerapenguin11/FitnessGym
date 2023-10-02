package com.example.fitnessgym.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.fitnessgym.R
import com.example.fitnessgym.databinding.ActivityMainBinding
import com.example.fitnessgym.utilits.APP_ACTIVITY
import com.example.fitnessgym.utilits.setStatusBarGradiantMain

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        APP_ACTIVITY = this
        setContentView(binding.root)
        setStatusBarGradiantMain(this)
    }
}
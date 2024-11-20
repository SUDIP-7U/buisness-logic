package com.example.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewmodel.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val result = intent.getStringExtra("rslt")
        binding.resultTv.text = result

    }
}
package com.example.mvvmproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var myViewmodel : MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myViewmodel = ViewModelProvider(this).get(MyViewModel::class.java)

        binding.textViewCounter.text = myViewmodel.getInitialCounter().toString()

        binding.buttonIncrement.setOnClickListener {
            binding.textViewCounter.text = myViewmodel.getUpdatedCounter().toString()
        }
    }
}
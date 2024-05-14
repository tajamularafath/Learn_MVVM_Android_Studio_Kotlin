package com.example.mvvmproject.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmproject.MyViewModel
import com.example.mvvmproject.databinding.ActivityMainBinding
import com.example.mvvmproject.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var myViewmodel : MyViewModel
    lateinit var calculatorViewModel : CalculatorViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myViewmodel = ViewModelProvider(this).get(MyViewModel::class.java)

        binding.textViewCounter.text = myViewmodel.getInitialCounter().toString()

        binding.buttonIncrement.setOnClickListener {
            binding.textViewCounter.text = myViewmodel.getUpdatedCounter().toString()
        }

        calculatorViewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)


        Log.e("OnCreate is Calling", "When ever the Activity1 is created onCreate will be call")
    }

    override fun onStart() {
        super.onStart()
        Log.e("OnStart", "Starting the Activity1")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume", "Resuming the Activity1")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("OnRestart", "Restarting the Activity1")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause" , "Pausing the Activity1")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop", "Stopping the Activity1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", "Destroyed the Activity1")
    }
}
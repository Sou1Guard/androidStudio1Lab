package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.example.lab1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.isVisible = false
        binding.btn1.setOnClickListener(){

            if (binding.btn1.text == "Отобразить"){
                binding.textView.isVisible = true
                binding.btn1.text = "Скрыть"
                }
            else {
                binding.btn1.text = "Отобразить"
                binding.textView.isVisible = false
            }

        }


    }
}
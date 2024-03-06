package com.example.laboration_1_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.laboration_1_kotlin.databinding.ActivityAbout2Binding
import com.example.laboration_1_kotlin.databinding.ActivityMainBinding

class AboutActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityAbout2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAbout2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val backToHomePageButton = binding.btnBack

        backToHomePageButton.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }



    }
}
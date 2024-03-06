package com.example.laboration_1_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.laboration_1_kotlin.databinding.ActivityLoggedInBinding

class LoggedInActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoggedInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoggedInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val loggedInWelcomeText = binding.tvLoggedInWelcome
        val backToHomePageButton = binding.btnBackToHomePage2

        loggedInWelcomeText.text = intent.getStringExtra("username")

        backToHomePageButton.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}
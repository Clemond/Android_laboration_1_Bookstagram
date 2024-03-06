package com.example.laboration_1_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.laboration_1_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val aboutButton = binding.btnAbout
        val logInButton = binding.btnLogIn

        aboutButton.setOnClickListener{
            val intent = Intent(this,AboutActivity2::class.java)
            startActivity(intent)
        }

        logInButton.setOnClickListener{
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent)
        }

        // TODO - make a toast on (read more) -> "Not available right now"

    }
}
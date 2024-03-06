package com.example.laboration_1_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.laboration_1_kotlin.databinding.ActivityLogInBinding

class LogInActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLogInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val backToHomePageButton = binding.btnBack
        val usernameInput = binding.etUsernameInput
        val signInButton = binding.btnSignIn
        val passwordInput = binding.etPasswordInput

        val wrongLogInInfo = Toast.makeText(applicationContext,"Wrong, try again", Toast.LENGTH_SHORT)

        val accountUsernames = mutableListOf<String>("Clemond", "StephenKingLover", "Nicholas")
        val accountPasswords = mutableListOf<String>("123", "Hej", "Rabbit99")

        signInButton.setOnClickListener{

            if (usernameInput.text.toString() == accountUsernames[0] && passwordInput.text.toString() == accountPasswords[0]){
                val intent = Intent(this, LoggedInActivity::class.java).apply {
                 putExtra("username", "Clemond")
                }

                startActivity(intent)
            }else{
                wrongLogInInfo.show()
            }

        }

        backToHomePageButton.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}

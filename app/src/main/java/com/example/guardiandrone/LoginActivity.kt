package com.example.guardiandrone

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val backButton = findViewById<ImageView>(R.id.backArrow)
        val loginButton = findViewById<Button>(R.id.btnLogin)
        val inputEmail = findViewById<EditText>(R.id.inputEmail)
        val inputPassword = findViewById<EditText>(R.id.inputPassword)

        // Back arrow
        backButton.setOnClickListener {
            startActivity(Intent(this, LandingActivity::class.java))
            finish()
        }

        // Enable login button only when both fields are filled
        fun updateLoginButtonState() {
            loginButton.isEnabled = inputEmail.text.isNotEmpty() && inputPassword.text.isNotEmpty()
        }

        inputEmail.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) = updateLoginButtonState()
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        inputPassword.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) = updateLoginButtonState()
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        // CLICK LISTENER SHOULD ALWAYS BE SET
        loginButton.setOnClickListener {
            startActivity(Intent(this, InterfaceActivity::class.java))
            finish()
        }

        // Initial state
        updateLoginButtonState()
    }
}

package com.example.guardiandrone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Back arrow
        val backButton = findViewById<ImageView>(R.id.backArrow)
        backButton.setOnClickListener {
            startActivity(Intent(this, LandingActivity::class.java))
            finish()
        }

        // LOGIN BUTTON InterfaceActivity
        val loginButton = findViewById<Button>(R.id.btnLogin)

        loginButton.setOnClickListener {
            val intent = Intent(this, InterfaceActivity::class.java)
            startActivity(intent)
        }
    }
}

package com.example.guardiandrone

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Find the back button by its ID
        val backButton = findViewById<ImageView>(R.id.backArrow)

        // Set click listener
        backButton.setOnClickListener {
            // Go back to LandingActivity
            val intent = Intent(this, LandingActivity::class.java)
            startActivity(intent)
            finish() // Optional: removes LoginActivity from back stack
        }
    }
}

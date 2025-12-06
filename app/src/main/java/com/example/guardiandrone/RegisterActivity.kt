package com.example.guardiandrone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Find the back button by its ID
        val backButton = findViewById<ImageView>(R.id.backArrow)

        // Set click listener
        backButton.setOnClickListener {
            // Go back to LandingActivity
            val intent = Intent(this, LandingActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

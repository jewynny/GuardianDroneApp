package com.example.guardiandrone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Back arrow → LandingActivity
        val backButton = findViewById<ImageView>(R.id.backArrow)
        backButton.setOnClickListener {
            val intent = Intent(this, LandingActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Register button → InterfaceActivity
        val registerButton = findViewById<Button>(R.id.btnRegister)
        registerButton.setOnClickListener {
            val intent = Intent(this, InterfaceActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

package com.example.guardiandrone

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.guardiandrone.R

class InterfaceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interface)

        // ===== BOTTOM NAV BUTTONS =====

        // Checklist → ReportActivity
        val logsButton = findViewById<ImageView>(R.id.navLogs)
        logsButton.setOnClickListener {
            val intent = Intent(this, ReportActivity::class.java)
            startActivity(intent)
        }

        // Drone icon (current page)
        val droneButton = findViewById<ImageView>(R.id.navDrones)
        droneButton.setOnClickListener {
            // Already on InterfaceActivity
        }

//        // Menu
//        val menuButton = findViewById<ImageView>(R.id.navMenu)
//        menuButton.setOnClickListener {
//            val intent = Intent(this, LandingActivity::class.java)
//            startActivity(intent)
//            finish()
//        }
    }
}

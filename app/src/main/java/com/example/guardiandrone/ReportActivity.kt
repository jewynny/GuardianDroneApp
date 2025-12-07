package com.example.guardiandrone

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
class ReportActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)


        // Logs (current page, optional)
        val logsBtn = findViewById<ImageView>(R.id.navLogs)
        logsBtn.setOnClickListener {
            // Already on ReportActivity
        }

        // Drones → InterfaceActivity
        val droneBtn = findViewById<ImageView>(R.id.navDrones)
        droneBtn.setOnClickListener {
            val intent = Intent(this, InterfaceActivity::class.java)
            startActivity(intent)
        }
    }
}

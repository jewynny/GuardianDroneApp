package com.example.guardiandrone

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
//import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

//        val profile = findViewById<LinearLayout>(R.id.rowProfile)
//        profile.findViewById<LinearLayout>(R.id.rowProfile).setOnClickListener {
//            startActivity(Intent(this, ProfileActivity::class.java))
//        })
//
//        findViewById<View>(R.id.rowSubscription)
//            .findViewById<TextView>(R.id.).text = "Subscription"
//
//        findViewById<View>(R.id.rowDevices)
//            .findViewById<TextView>(R.id.).text = "Devices"
//
//        findViewById<View>(R.id.rowNotification)
//            .findViewById<TextView>(R.id.).text = "Notification"
//
//        findViewById<View>(R.id.rowSupport)
//            .findViewById<TextView>(R.id.).text = "Support"
//
//        findViewById<View>(R.id.rowPrivacy)
//            .findViewById<TextView>(R.id.).text = "Privacy Center"
//
//        findViewById<View>(R.id.rowAbout)
//            .findViewById<TextView>(R.id.).text = "About"


        val logsBtn = findViewById<ImageView>(R.id.navLogs)
        logsBtn.setOnClickListener {
            startActivity(Intent(this, ReportActivity::class.java))
        }

        val dronesBtn = findViewById<ImageView>(R.id.navDrones)
        dronesBtn.setOnClickListener {
            startActivity(Intent(this, InterfaceActivity::class.java))
        }
    }
}

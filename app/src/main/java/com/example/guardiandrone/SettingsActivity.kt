//package com.example.guardiandrone
//
//import android.os.Bundle
//import android.widget.TextView
//import androidx.appcompat.app.AppCompatActivity
//
//class SettingsActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_settings)
//
//        val profile = findViewById<View>(R.id.rowProfile)
//        profile.findViewById<TextView>(R.id.settingLabel).text = "Profile"
//
//        findViewById<View>(R.id.rowSubscription)
//            .findViewById<TextView>(R.id.settingLabel).text = "Subscription"
//
//        findViewById<View>(R.id.rowDevices)
//            .findViewById<TextView>(R.id.settingLabel).text = "Devices"
//
//        findViewById<View>(R.id.rowNotification)
//            .findViewById<TextView>(R.id.settingLabel).text = "Notification"
//
//        findViewById<View>(R.id.rowSupport)
//            .findViewById<TextView>(R.id.settingLabel).text = "Support"
//
//        findViewById<View>(R.id.rowPrivacy)
//            .findViewById<TextView>(R.id.settingLabel).text = "Privacy Center"
//
//        findViewById<View>(R.id.rowAbout)
//            .findViewById<TextView>(R.id.settingLabel).text = "About"
//
//
//        val logsBtn = findViewById<ImageView>(R.id.navLogs)
//        logsBtn.setOnClickListener {
//            startActivity(Intent(this, ReportActivity::class.java))
//        }
//
//        val dronesBtn = findViewById<ImageView>(R.id.navDrones)
//        dronesBtn.setOnClickListener {
//            startActivity(Intent(this, InterfaceActivity::class.java))
//        }
//    }
//}

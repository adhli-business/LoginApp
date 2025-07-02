package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)

        Log.d("LIFECYCLE", "HomeActivity - onCreate")

        val username = intent.getStringExtra("username") ?: "User"
        val textWelcome = findViewById<TextView>(R.id.textWelcome)
        val logoutButton = findViewById<Button>(R.id.buttonLogout)

        textWelcome.text = "Selamat datang, $username!"

        logoutButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // keluar dari HomeActivity
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("LIFECYCLE", "HomeActivity - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LIFECYCLE", "HomeActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LIFECYCLE", "HomeActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LIFECYCLE", "HomeActivity - onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LIFECYCLE", "HomeActivity - onDestroy")
    }
}

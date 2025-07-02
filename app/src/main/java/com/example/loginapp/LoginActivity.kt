package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        Log.d("LIFECYCLE", "LoginActivity - onCreate")

        val usernameField = findViewById<EditText>(R.id.editUsername)
        val passwordField = findViewById<EditText>(R.id.editPassword)
        val loginButton = findViewById<Button>(R.id.buttonLogin)

        loginButton.setOnClickListener {
            val username = usernameField.text.toString()
            val password = passwordField.text.toString()

            if (username.isNotBlank() && password.isNotBlank()) {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("username", username)
                startActivity(intent)
                finish() // keluar dari LoginActivity
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("LIFECYCLE", "LoginActivity - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LIFECYCLE", "LoginActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LIFECYCLE", "LoginActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LIFECYCLE", "LoginActivity - onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LIFECYCLE", "LoginActivity - onDestroy")
    }
}

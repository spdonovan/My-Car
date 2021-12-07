package com.example.mycar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class buttonDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_display)
    }

    /** Called when the user taps the Send button */
    fun moveToMap(view: View) {
        // Do something in response to button

        val intent = Intent(this, MapsActivity::class.java).apply{}

        startActivity(intent)
    }

}
package com.nautilus.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nautilus.cicdreference.Greeting
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloView = findViewById<TextView>(R.id.hello_text)
        helloView.text = Greeting().greeting()
    }
}

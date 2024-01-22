package com.kelvinkamara.viewmodellivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCount = findViewById<TextView>(R.id.tvCount)
        val tvButton = findViewById<Button>(R.id.btnCount)
        tvCount.text = 0.toString()
        tvButton.setOnClickListener {
            count++
            tvCount.text = count.toString()
        }
    }
}
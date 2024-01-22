package com.kelvinkamara.viewmodellivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private var count: Int = 0
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(
            this
        )[MainActivityViewModel::class.java]

        val tvCount = findViewById<TextView>(R.id.tvCount)
        val tvButton = findViewById<Button>(R.id.btnCount)
        tvCount.text = viewModel.count.toString()
        tvButton.setOnClickListener {
            viewModel.updateCount()
            tvCount.text = viewModel.count.toString()
        }
    }
}
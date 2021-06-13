package com.bignerdranch.android.adobexdtoandroidxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SecondActivity : AppCompatActivity() {

    private lateinit var second_back_arrow : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        second_back_arrow = findViewById(R.id.second_back_arrow)

        second_back_arrow.setOnClickListener {
            onBackPressed()
        }
    }
}
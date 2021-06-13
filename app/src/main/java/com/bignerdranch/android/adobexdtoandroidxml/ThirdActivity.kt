package com.bignerdranch.android.adobexdtoandroidxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.ScrollView

class ThirdActivity : AppCompatActivity() {

    private lateinit var down_arrow : ImageView
    private lateinit var scroll_view : ScrollView
    private lateinit var animation : Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        down_arrow = findViewById(R.id.down_arrow)
        scroll_view = findViewById(R.id.scroll_view)
        animation = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom)
        scroll_view.animation = animation


        down_arrow.setOnClickListener {
            finish()
        }




    }
}
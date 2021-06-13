package com.bignerdranch.android.adobexdtoandroidxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var second_back_arrow : ImageView
    private lateinit var up_arrow : ImageView
    private lateinit var more_details : TextView
    private lateinit var customers : TextView
    private lateinit var rating : TextView
    private lateinit var ratingBar : RatingBar
    private lateinit var second_description : TextView
    private lateinit var second_title : TextView
    private lateinit var anim_from_top : Animation
    private lateinit var anim_from_right : Animation
    private lateinit var anim_from_bottom : Animation
    private lateinit var anim_from_left : Animation





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        animation()

    }

    private fun animation() {
        second_back_arrow = findViewById(R.id.second_back_arrow)
        up_arrow = findViewById(R.id.up_arrow)
        more_details = findViewById(R.id.more_details)
        customers = findViewById(R.id.customers)
        rating = findViewById(R.id.rating)
        ratingBar = findViewById(R.id.ratingBar)
        second_description = findViewById(R.id.second_description)
        second_title = findViewById(R.id.second_title)

        anim_from_top = AnimationUtils.loadAnimation(this, R.anim.anim_from_top)
        anim_from_right = AnimationUtils.loadAnimation(this, R.anim.anim_from_right)
        anim_from_bottom = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom)
        anim_from_left = AnimationUtils.loadAnimation(this, R.anim.anim_from_left)


        second_back_arrow.animation = anim_from_right
        second_title.animation = anim_from_left
        second_description.animation = anim_from_left
        ratingBar.animation = anim_from_right
        rating.animation = anim_from_right
        up_arrow.animation = anim_from_bottom
        more_details.animation = anim_from_bottom
        customers.animation = anim_from_right


        up_arrow.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        second_back_arrow.setOnClickListener {
            //onBackPressed()
            finish()
        }
    }
}
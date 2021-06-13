package com.bignerdranch.android.adobexdtoandroidxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.SearchView
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var cardView1 : CardView
    private lateinit var cardView2 : CardView
    private lateinit var cardView3 : CardView
    private lateinit var anim_from_bottom : Animation
    private lateinit var anim_from_top : Animation
    private lateinit var anim_from_left : Animation
    private lateinit var imageView: ImageView
    private lateinit var firstText : TextView
    private lateinit var secondText : TextView
    private lateinit var thirdText : TextView
    private lateinit var forthText : TextView
    private lateinit var fifthText : TextView
    private lateinit var sixthText : TextView
    private lateinit var searchView : SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animation()



    }

    private fun animation(){

        cardView1 = findViewById(R.id.cardview1)
        cardView2 = findViewById(R.id.cardview2)
        cardView3 = findViewById(R.id.cardview3)
        imageView = findViewById(R.id.imageView)
        firstText = findViewById(R.id.firstText)
        secondText = findViewById(R.id.secondText)
        thirdText = findViewById(R.id.thirdText)
        forthText = findViewById(R.id.fourthText)
        fifthText = findViewById(R.id.fifthText)
        sixthText = findViewById(R.id.sixthText)
        searchView = findViewById(R.id.searchView)


        anim_from_bottom = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom)
        cardView1.animation = anim_from_bottom
        cardView2.animation = anim_from_bottom
        cardView3.animation = anim_from_bottom


        anim_from_top = AnimationUtils.loadAnimation(this, R.anim.anim_from_top)
        imageView.animation = anim_from_top
        firstText.animation = anim_from_top
        secondText.animation = anim_from_top
        thirdText.animation = anim_from_top
        forthText.animation = anim_from_top
        fifthText.animation = anim_from_top
        sixthText.animation = anim_from_top

        anim_from_left = AnimationUtils.loadAnimation(this, R.anim.anim_from_left)
        searchView.animation = anim_from_left

        cardView1.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}
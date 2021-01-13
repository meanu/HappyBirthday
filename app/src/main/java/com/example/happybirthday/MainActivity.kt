package com.example.happybirthday

import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.TranslateAnimation
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var round1:ImageView = findViewById(R.id.round1)
        var round2:ImageView = findViewById(R.id.round2)
        var square1:ImageView = findViewById(R.id.square1)
        var square2:ImageView = findViewById(R.id.square2)
        round1.setImageDrawable(getDrawable(R.drawable.present_round2))
        round2.setImageDrawable(getDrawable(R.drawable.present_round2))
        square2.setImageDrawable(getDrawable(R.drawable.present_square))
        square1.setImageDrawable(getDrawable(R.drawable.present_square))



        present.setOnClickListener {


            val ani = TranslateAnimation(0f,200f,0f,-200f)
            ani.duration = 1000
            ani.fillAfter = false
            square2.startAnimation(ani)

            val ani3 = TranslateAnimation(0f,100f,0f,-200f)
            ani3.duration = 1000
            ani3.fillAfter = false
            square1.startAnimation(ani3)
//
//            val ani2 = TranslateAnimation(0f,-200f,0f,-200f)
//            ani2.duration = 1000
//            ani2.fillAfter = false
            val hyperspaceJump: Animation = AnimationUtils.loadAnimation(this, R.anim.alpha_tozero)
            round1.animation = hyperspaceJump
//            round1.startAnimation(ani2)

            val ani4 = TranslateAnimation(0f,-100f,0f,-200f)
            ani4.duration = 1000
            ani4.fillAfter = false
            round2.startAnimation(ani4)

//                   round1.animate().translationX(-300f).setDuration(2000).start()
//                   round1.animate().translationY(-300f).setDuration(1500).start()
//                   round1.animate().alpha(0f).setDuration(2000).start()

//                   round2.setImageDrawable(getDrawable(R.drawable.present_round2))
//                   round2.animate().translationX(300f).setDuration(2000).start()
//                   round2.animate().translationY(-500f).setDuration(1500).start()
//                   round2.animate().alpha(0f).setDuration(2400).start()
//
//                   square1.setImageDrawable(getDrawable(R.drawable.present_square))
//                   square1.animate().translationX(-300f).setDuration(2000).start()
//                   square1.animate().translationY(-430f).setDuration(1500).start()
//                   square1.animate().alpha(0f).setDuration(2000).start()

//                   square2.animate().translationX(300f).setDuration(2000).start()
//                   square2.animate().translationY(-300f).setDuration(1500).rotation(100f).start()
//                   square1.clearAnimation()
//                   square2.animate().alpha(0f).setDuration(2200).start()



            }
        }
    }

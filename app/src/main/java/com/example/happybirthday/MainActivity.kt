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

        /* USED KOTLIN EXTENTION
        val round1: ImageView = findViewById(R.id.round1)
        val round2: ImageView = findViewById(R.id.round2)
        val square1: ImageView = findViewById(R.id.square1)
        val square2: ImageView = findViewById(R.id.square2)
        */

        round1.setImageDrawable(getDrawable(R.drawable.present_round2))
        round2.setImageDrawable(getDrawable(R.drawable.present_round2))
        square2.setImageDrawable(getDrawable(R.drawable.present_square))
        square1.setImageDrawable(getDrawable(R.drawable.present_square))

        val happyBirthday: Animation = AnimationUtils.loadAnimation(this, R.anim.happy_birthday)
        val happyBirthday2: Animation = AnimationUtils.loadAnimation(this, R.anim.happy_birthday2)
        val happyBirthday3: Animation = AnimationUtils.loadAnimation(this, R.anim.happy_birthday3)
        val happyBirthday4: Animation = AnimationUtils.loadAnimation(this, R.anim.happy_birthday4)

        present.setOnClickListener {

            round1.startAnimation(happyBirthday)
            square2.startAnimation(happyBirthday2)
            round2.startAnimation(happyBirthday3)
            square1.startAnimation(happyBirthday4)

            /*
                ###ANIMATE WITH CODE###
                val ani = TranslateAnimation(0f,200f,0f,-200f)
                ani.duration = 1000
                ani.fillAfter = false
                square2.startAnimation(ani)

                round2.setImageDrawable(getDrawable(R.drawable.present_round2))
                round2.animate().translationX(300f).setDuration(2000).start()
                round2.animate().translationY(-500f).setDuration(1500).start()
                round2.animate().alpha(0f).setDuration(2400).start()
            */
        }
    }
}

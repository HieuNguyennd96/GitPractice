package com.learning.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        asdhaksdgahsdoihhfuqwehiqohweriohirohqowhrohq
    }

    private fun IntRange.random(): Int = Random.nextInt((endInclusive + 1) - start) + start
}

package com.example.learnintent.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.learnintent.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun changeToNextActivity(view: View){
        val intentToChangeToNextActivity = Intent(this, SecondActivity::class.java)
        startActivity(intentToChangeToNextActivity)
    }

//    fun changeToNextActivity(view: View) {}

}
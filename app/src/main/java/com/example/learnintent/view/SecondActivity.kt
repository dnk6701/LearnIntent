package com.example.learnintent.view

import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.learnintent.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun callToSupport(view: View){
        val intentCallToSupport = Intent(Intent.ACTION_CALL)
        intentCallToSupport.data = Uri.parse("tel: +79148883019")
        startActivity(intentCallToSupport)
    }

    fun makeSearch(view: View){
        val intentToSearchSomething = Intent(Intent.ACTION_WEB_SEARCH)
        intentToSearchSomething.putExtra(SearchManager.QUERY,"Советские песни")
        startActivity(intentToSearchSomething)
    }


}
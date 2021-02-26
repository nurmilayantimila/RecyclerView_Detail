package com.example.mysubmission_dicoding

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar

class AboutMe : AppCompatActivity(), View.OnClickListener {

    private var title= "Kuliner Sulsel"
    lateinit var gmail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)
        setActionBarTitle(title)

        val actionBar = supportActionBar
        actionBar!!.title="Kuliner Sulsel"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        gmail = findViewById(R.id.tv_gmail)
        gmail.setOnClickListener(this)


    }



    private fun setActionBarTitle(title : String) {
        if (supportActionBar != null)
            (supportActionBar as ActionBar).title=title
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(v: View?) {
        val profileURL = "https://www.dicoding.com/users/nurmilayanti"
        val checkProfileIntent = Intent(Intent.ACTION_VIEW, Uri.parse(profileURL))
        if (checkProfileIntent.resolveActivity(packageManager) != null) {
            startActivity(checkProfileIntent)
        }
    }
}
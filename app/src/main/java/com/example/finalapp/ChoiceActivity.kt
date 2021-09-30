package com.example.finalapp

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ChoiceActivity : AppCompatActivity() {

    lateinit var moneyButton: Button
    lateinit var geoButton: Button
    lateinit var cultureButton: Button
    lateinit var langButton: Button
    lateinit var doneButton : Button
    lateinit var moneyPic : ImageView
    lateinit var geoPic : ImageView
    lateinit var langPic : ImageView
    lateinit var culturePic : ImageView

    var money = 1
    var geo = 2
    var culture = 3
    var language = 4
    var rightAnswers : Int? = null
    var totQs : Int? = null
    lateinit var username : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        username = intent.getStringExtra(Constants.USER_NAME).toString()
        rightAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        totQs = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        doneButton = findViewById(R.id.doneButton)
        moneyButton = findViewById(R.id.moneyButton)
        cultureButton = findViewById(R.id.cultureButton)
        geoButton = findViewById(R.id.geoButton)
        langButton = findViewById(R.id.langButton)
        moneyPic = findViewById(R.id.moneyPic)
        geoPic = findViewById(R.id.geoPic)
        culturePic = findViewById(R.id.culturePic)
        langPic = findViewById(R.id.langPic)


        moneyPic.setOnClickListener {

            val intent = Intent (this , AlternativeActivity::class.java)
            intent.putExtra(Constants.USER_NAME, username)
            intent.putExtra(Constants.CATEGORY, money)
            startActivity(intent)


        }
        geoPic.setOnClickListener {

            val intent = Intent (this , AlternativeActivity::class.java)
            intent.putExtra(Constants.USER_NAME, username)
            intent.putExtra(Constants.CATEGORY, geo)
            startActivity(intent)

        }

        culturePic.setOnClickListener {
            val intent = Intent (this , AlternativeActivity::class.java)
            intent.putExtra(Constants.USER_NAME, username)
            intent.putExtra(Constants.CATEGORY, culture)
            startActivity(intent)

        }

        langPic.setOnClickListener {
            val intent = Intent (this , AlternativeActivity::class.java)
            intent.putExtra(Constants.USER_NAME, username)
            intent.putExtra(Constants.CATEGORY, language)
            startActivity(intent)

        }

        moneyButton.setOnClickListener {

            val intent = Intent (this , QuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, username)
            intent.putExtra(Constants.CATEGORY, money)
            startActivity(intent)


        }
        geoButton.setOnClickListener {

            val intent = Intent (this , QuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, username)
            intent.putExtra(Constants.CATEGORY, geo)
            startActivity(intent)

        }

        cultureButton.setOnClickListener {
            val intent = Intent (this , QuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, username)
            intent.putExtra(Constants.CATEGORY, culture)
            startActivity(intent)

        }

        langButton.setOnClickListener {
            val intent = Intent (this , QuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, username)
            intent.putExtra(Constants.CATEGORY, language)
            startActivity(intent)
        }

        doneButton.setOnClickListener {
            val intent = Intent (this , ResultActivity::class.java)
            intent.putExtra(Constants.USER_NAME, username)
           intent.putExtra(Constants.CORRECT_ANSWERS, rightAnswers)
            intent.putExtra(Constants.TOTAL_QUESTIONS, totQs)
            startActivity(intent)

        }

    }
}
package com.example.finalapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    lateinit var usernameTV: TextView
    lateinit var score: TextView
    lateinit var finButton: Button
    lateinit var username1 : String
    private var totalQuestionsHere : Int? = null
    private var correctAnswerhere : Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

       val choice1 = intent.getIntExtra(Constants.RESULTS,0)


        usernameTV = findViewById(R.id.usernameTV)
        score = findViewById(R.id.score)
        finButton = findViewById(R.id.finButton)


        if (choice1 == 1) {
            showResults()
        }

        else {

            username1 = intent.getStringExtra(Constants.USER_NAME).toString()
            totalQuestionsHere = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
            correctAnswerhere = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

            usernameTV.text = username1

            score.text = "Your score is $correctAnswerhere out of $totalQuestionsHere"
            finButton.setOnClickListener {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }

        }

    }

    fun showResults() {
        username1 = intent.getStringExtra(Constants.USER_NAME).toString()
        totalQuestionsHere = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        correctAnswerhere = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        usernameTV.text = username1

        score.text = "Your score is $correctAnswerhere out of $totalQuestionsHere"
        finButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish() }
    }
}
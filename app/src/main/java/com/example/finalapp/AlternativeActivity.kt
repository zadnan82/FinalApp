package com.example.finalapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import org.w3c.dom.Text

class AlternativeActivity : AppCompatActivity(), View.OnClickListener{

    lateinit var mainQuestion: TextView
    lateinit var opt1: TextView
    lateinit var opt2: TextView
    lateinit var opt3: TextView
    lateinit var opt4: TextView
    lateinit var submitButton: Button
    lateinit var  imageDisplay : ImageView
    var moneyQuestionsList2 = mutableListOf<QuestionClass2>()
    var geoQuestionsList2 = mutableListOf<QuestionClass2>()
    var cultureQuestionsList2 = mutableListOf<QuestionClass2>()
    var languageQuestionsList2 = mutableListOf<QuestionClass2>()
    var currentPosition : Int = 1
    var selectedPosition : Int = 0
    var rightAnswer : Int = 0
    lateinit var username1 : String
    var answerCounter= 0
    var lista = mutableListOf<QuestionClass2>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alternative)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        username1 = intent.getStringExtra(Constants.USER_NAME).toString()
        val decision = intent.getIntExtra(Constants.CATEGORY, 0)


        mainQuestion = findViewById(R.id.mainQuestion)
        imageDisplay = findViewById(R.id.imageDisplay)
        opt1 = findViewById(R.id.opt1)
        opt2 = findViewById(R.id.opt2)
        opt3 = findViewById(R.id.opt3)
        opt4 = findViewById(R.id.opt4)
        submitButton = findViewById(R.id.submitButton)


        if (decision == 1) {
            moneyQuestionsList2 = Constants2.getQuestionsMoney2()
            lista = moneyQuestionsList2
            generateQuestions()

        } else if (decision == 2) {
            geoQuestionsList2 = Constants2.getQuestionsGeo2()
            lista = geoQuestionsList2
            generateQuestions()

        } else if (decision == 3) {
                cultureQuestionsList2 = Constants2.getQuestionsCulture2()
                lista = cultureQuestionsList2
                generateQuestions()

        } else if (decision == 4) {
                languageQuestionsList2 = Constants2.getQuestionsLanguage2()
                lista = languageQuestionsList2
                generateQuestions()
        }
        opt1.setOnClickListener(this)
        opt2.setOnClickListener(this)
        opt3.setOnClickListener(this)
        opt4.setOnClickListener(this)
        submitButton.setOnClickListener(this)

    }

           fun generateQuestions() {

               val questions2 = lista[currentPosition- 1]

               defaultView()


               if (answerCounter == lista.size) {
                   submitButton.text = "Finish"
               } else {

                   submitButton.text = "Submit"
               }

               mainQuestion.text = questions2.questions2
               imageDisplay.setImageResource(questions2.pic2)
               opt1.text = questions2.option1
               opt2.text = questions2.option2
               opt3.text = questions2.option3
               opt4.text = questions2.option4
           }

    private fun defaultView() {
        val answers = ArrayList<TextView>()
        answers.add(0, opt1)
        answers.add(1, opt2)
        answers.add(2, opt3)
        answers.add(3, opt4)

        for (op in answers) {
            op.setTextColor(Color.parseColor("#7A8089"))
            op.typeface = Typeface.DEFAULT
            op.background = ContextCompat.getDrawable(
                this, R.drawable.default_option_border_bg
            )
        }

    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.opt1 -> {
                selectedOption(opt1, 1)
            }
            R.id.opt2 -> {
                selectedOption(opt2, 2)
            }
            R.id.opt3 -> {
                selectedOption(opt3, 3)
            }

            R.id.opt4 -> {
                selectedOption(opt4, 4)
            }
            R.id.submitButton -> {


                if (selectedPosition == 0) {
                    currentPosition++


                    when {
                        currentPosition <= lista.size -> {
                            generateQuestions()
                        }
                        else -> {
                            val intent = Intent(this, ResultActivity::class.java)

                            startActivity(intent)
                        }
                    }
                } else {

                    val question = lista.get(currentPosition - 1)

                    if (question.rightAnswer2 != selectedPosition) {
                        answerView(selectedPosition, R.drawable.wrong_option_border_bg)
                    } else {
                        rightAnswer++
                    }
                    answerView(question.rightAnswer2, R.drawable.correct_option_border_bg)
                    if (currentPosition == lista.size) {
                        submitButton.text = "Finish"
                        submitButton.setOnClickListener {
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, username1)
                            intent.putExtra(Constants.CORRECT_ANSWERS, rightAnswer)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, lista.size)
                            startActivity(intent)
                        }
                    } else {
                        submitButton.text = "Go to next question"
                    }
                    selectedPosition = 0
                }
            }

        }
    }
    private fun answerView(answer: Int, drawablesView: Int) {

        when (answer) {
            1 -> {
                opt1.background = ContextCompat.getDrawable(this, drawablesView)
            }
            2 -> {
                opt2.background = ContextCompat.getDrawable(this, drawablesView)
            }
            3 -> {
                opt3.background = ContextCompat.getDrawable(this, drawablesView)
            }
            4 -> {
                opt4.background = ContextCompat.getDrawable(this, drawablesView)
            }
        }
    }



    private fun selectedOption(tv: TextView, selectedOptionNum: Int) {
        defaultView()
        selectedPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this, R.drawable.selected_option_border_bg
        )

    }
}
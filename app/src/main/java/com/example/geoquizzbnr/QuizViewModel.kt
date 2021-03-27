package com.example.geoquizzbnr

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"

class QuizViewModel: ViewModel() {

    private val questionBank = listOf(
        Question(R.string.question_australia,true),
        Question(R.string.question_oceans,true),
        Question(R.string.question_mideast,false),
        Question(R.string.question_africa,false),
        Question(R.string.question_americas,true),
        Question(R.string.question_asia,true)
    )

    var currentIndex = 0

    val currentQuestionAnswer: Boolean
    get() = questionBank[currentIndex].answer

    val currentQuestionText:Int
    get() = questionBank[currentIndex].textresId

    fun moveToNext(){
        // permet de revenir à zero lorsqu'on arrive en limite de tableau ( 6%6 = 0 )
        currentIndex = (currentIndex +1 ) % questionBank.size
    }
}
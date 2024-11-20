package com.example.viewmodel

import androidx.lifecycle.ViewModel

class QuizViewModel : ViewModel() {
    //VIEWMODEL (BUISNESS LOGIC)
    private var quizQuestions = DataSource.quizQuestions
    private var quizList : MutableList<QuizQuestion> =quizQuestions
    //Buisness Logic in View Model
    init {
        quizList.shuffle()
    }

    private var currentQuestionIndex = 0
    private var score = 0

    fun restart() {
        currentQuestionIndex = 0
    }

    fun getCurrentQuestion(): QuizQuestion {
        return quizList[currentQuestionIndex]
    }

    fun getNextQuestion(): QuizQuestion? {
        currentQuestionIndex++
        return if (currentQuestionIndex < quizList.size) {
            quizList[currentQuestionIndex]
        } else {
            null
        }
    }

    fun checkAnswer(selectedIndex: Int): Boolean {
        val currentQuestion = quizList[currentQuestionIndex]
        return if (selectedIndex == currentQuestion.correctAnswerIndex) {
            score +=2
            true
        } else {
            score--
            false
        }
    }
    fun getScore(): Int {
        return score
    }

    fun getQuestionSize(): Int {
        return quizList.size
    }
}

//IN THIS MODEL WE USE WE ONLY USE STABLE BUISNESS LOGIC
//VIEWMODEL CLASS HAVE NO DEPENDS TO OTHER CLASS
//VIEWMODEL is an INDEPENDENT Class
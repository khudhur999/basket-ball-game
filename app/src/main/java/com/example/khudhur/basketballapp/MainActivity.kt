package com.example.khudhur.basketballapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        teamA1ptButton.setOnClickListener {
            fullTime(it.id)
        }
        teamA2ptButton.setOnClickListener {
            fullTime(it.id)
        }
        teamA3ptButton.setOnClickListener {
            fullTime(it.id)
        }
        teamB1ptButton.setOnClickListener {
            fullTime(it.id)
        }
        teamB2ptButton.setOnClickListener {
            fullTime(it.id)
        }
        teamB3ptButton.setOnClickListener {
            fullTime(it.id)

        }
        fullTimeButton.setOnClickListener {
            fullTime(it.id)
        }
        clearButton.setOnClickListener {
            fullTime(it.id)
        }



    }
    var scoreA: Int = 0
    var scoreB: Int = 0
    fun fullTime(clickedButton: Int) {

        when (clickedButton) {
            teamA1ptButton.id -> {
                scoreA += 1
            }
            teamA2ptButton.id -> {
                scoreA += 2
            }
            teamA3ptButton.id -> {
                scoreA += 3
            }
            teamB1ptButton.id -> {
                scoreB += 1
            }
            teamB2ptButton.id -> {
                scoreB += 2
            }
            teamB3ptButton.id -> {
                scoreB += 3
            }

            fullTimeButton.id -> {
                val teamA = teamAeditText.text.toString()
                val teamB = teamBeditText.text.toString()


                if (scoreA > scoreB){
                resultTextView.text = "$teamA win"
            }
                else {
                resultTextView.text = "$teamB win"
            }
                if (scoreA == scoreB){
                    resultTextView.text = "draw"
                }

            }
            clearButton.id ->{
                resultTextView.text = ""

                scoreA = 0
                scoreB = 0
                teamAscoreTextView.text = scoreA.toString()
                teamBscoreTextView.text = scoreB.toString()
                val emptyA : String = " "
                val emptyB : String = " "
//                teamAeditText.text = emptyA
//                teamBeditText.text = emptyB


            }

        }
        teamAscoreTextView.text = "$scoreA"
        teamBscoreTextView.text = "$scoreB"



    }
//    fun gameOvre (on: Int) {
//      when (on) {
//          teamA1ptButton.id -> {
//              scoreA += 0
//          }
//          teamA2ptButton.id -> {
//              scoreA += 0
//          }
//          teamA3ptButton.id -> {
//              scoreA += 0
//          }
//          teamB1ptButton.id -> {
//              scoreB += 0
//          }
//          teamB2ptButton.id -> {
//              scoreB += 0
//          }
//          teamB3ptButton.id -> {
//              scoreB += 0
//          }
//          fullTimeButton.id -> {
//              val teamA = teamAeditText.text.toString()
//              val teamB = teamBeditText.text.toString()
//
//
//              if (scoreA > scoreB){
//                  resultTextView.text = "$teamA win"
//              }
//              else {
//                  resultTextView.text = "$teamB win"
//              }
//              if (scoreA == scoreB){
//                  resultTextView.text = "draw"
//              }
//
//          }
//        }
//    }
}


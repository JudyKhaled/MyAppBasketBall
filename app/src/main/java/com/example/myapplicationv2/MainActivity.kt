package com.example.myapplicationv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Court Counter")
        val teamAscore=findViewById<TextView>(R.id.teamAscore)
        val teamBscore=findViewById<TextView>(R.id.teamBscore)
        val a3BTN=findViewById<Button>(R.id.teamA3ptsBTN)
        val b3BTN=findViewById<Button>(R.id.teamB3ptsBTN)
        val a2BTN=findViewById<Button>(R.id.teamA2ptsBTN)
        val b2BTN=findViewById<Button>(R.id.teamB2ptsBTN)
        val afreethrowBTN=findViewById<Button>(R.id.teamAfreethrowBTN)
        val bfreethrowBTN=findViewById<Button>(R.id.teamBfreethrow)
        val RST=findViewById<Button>(R.id.resetBTN)
        var teamAvalue:Int=0
        var teamBvalue:Int=0
        a3BTN.setOnClickListener {
            teamAvalue=teamAvalue+3
            teamAscore.setText(Integer.toString(teamAvalue))
        }
        b3BTN.setOnClickListener {
            teamBvalue=teamBvalue+3
            teamBscore.setText(Integer.toString(teamBvalue))
        }
        a2BTN.setOnClickListener {
            teamAvalue=teamAvalue+2
            teamAscore.setText(Integer.toString(teamAvalue))

        }
        b2BTN.setOnClickListener {
            teamBvalue=teamBvalue+2
            teamBscore.setText(Integer.toString(teamBvalue))
        }
        afreethrowBTN.setOnClickListener {
            teamAvalue=teamAvalue+1
            teamAscore.setText(Integer.toString(teamAvalue))
        }
        bfreethrowBTN.setOnClickListener {
            teamBvalue=teamBvalue+1
            teamBscore.setText(Integer.toString(teamBvalue))
        }
        RST.setOnClickListener {
            teamAvalue=0
            teamBvalue=0
            teamAscore.setText(Integer.toString(teamAvalue))
            teamBscore.setText(Integer.toString(teamBvalue))

        }


    }

    override fun onClick(p0: View?) {

    }

}
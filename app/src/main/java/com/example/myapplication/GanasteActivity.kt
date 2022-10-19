package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class GanasteActivity : AppCompatActivity() {
lateinit var highCore:TextView
lateinit var intentCount:TextView
lateinit var numberWin:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.setContentView(R.layout.activity_ganaste)
highCore=findViewById(R.id.resultHigscore)
intentCount=findViewById(R.id.resultIntent)
numberWin=findViewById(R.id.resultNumerWin)


    }
}
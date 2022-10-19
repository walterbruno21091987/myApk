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
       setContentView(R.layout.activity_ganaste)
highCore=findViewById<TextView?>(R.id.resultHigscore).apply { text="${intent.getStringExtra("score")}" }
intentCount=findViewById<TextView?>(R.id.resultIntent).apply { text=intent.getStringExtra("intentos") }
numberWin=findViewById<TextView?>(R.id.resultNumerWin).apply { text=intent.getStringExtra("numero") }


    }
}
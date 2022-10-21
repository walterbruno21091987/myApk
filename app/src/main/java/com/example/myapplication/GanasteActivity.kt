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
        val bundle=intent.extras

highCore=findViewById<TextView?>(R.id.resultHigscore)
        highCore.text=bundle?.getInt("score").toString()
intentCount=findViewById<TextView?>(R.id.resultIntent)
        intentCount.text=bundle?.getInt("intentos").toString()
numberWin=findViewById<TextView?>(R.id.resultNumerWin)
 numberWin.text=bundle?.getInt("numero").toString()

    }
}
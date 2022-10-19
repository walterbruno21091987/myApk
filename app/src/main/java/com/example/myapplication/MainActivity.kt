package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton
import exception.WrongNumberException

lateinit var enteredNumber:EditText
lateinit var send:FloatingActionButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        var ramdonNumber=(Math.random()*100+1).toInt()
        var numberOfAttemptsCounter=0
        var highestScore:Int?=null
        enteredNumber=binding.number
        send=binding.enviar
        send.setOnClickListener {
            try{val numberSend=enteredNumber.text.toString().toInt()
             try{

                 if(numberSend>=1&&numberSend<=100){

                     numberOfAttemptsCounter++
                     when(numberSend){
                         ramdonNumber->{
                             if(highestScore!=null){
                                 if(numberOfAttemptsCounter<highestScore!!){
                                     highestScore=numberOfAttemptsCounter
                                 }
                             }
                             else{
                                 highestScore=numberOfAttemptsCounter
                             }

                            binding.printText="""      GANASTEEEEEE!!!! 
                                 |cantidad de intentos=$numberOfAttemptsCounter
                                 |record=$highestScore
                             """.trimMargin()
                             numberOfAttemptsCounter=0
                             ramdonNumber=(Math.random()*100+1).toInt()


                         }
                         in 1..ramdonNumber-1->{
                           binding.printText="""        ES MAYOR 
                                 |cantidad de intentos=$numberOfAttemptsCounter
                             """.trimMargin()

                         }
                         in ramdonNumber+1..100->{
                             binding.printText="""           ES MENOR 
                                 |cantidad de intentos=$numberOfAttemptsCounter
                             """.trimMargin()


                         }
                     }
                 } else {
                     throw WrongNumberException("numero incorrecto debe ingresar un numero del 1 al 100") }
             }catch (e:WrongNumberException){
                 Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
             }
         }catch (ex:java.lang.Exception){
             Toast.makeText(this,"Debe ingresar un valor",Toast.LENGTH_LONG).show()
         }

        }
    }
}
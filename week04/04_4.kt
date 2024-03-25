package com.example.week04_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edit1 : EditText;  lateinit var edit2 : EditText
    lateinit var btnAdd : Button;   lateinit var btnSub : Button
    lateinit var btnMul : Button;   lateinit var btnDiv : Button

    lateinit var textResult : TextView
    lateinit var num1 : String; lateinit var num2 :  String
    var result : Int? = null
    var number : Int = 0
    var tictok : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = number.toString() + "회 계산기"

        edit1 = findViewById<EditText>(R.id.Edit1)
        edit2 = findViewById<EditText>(R.id.Edit2)

        btnAdd = findViewById<Button>(R.id.BtnAdd)
        btnSub = findViewById<Button>(R.id.BtnSub)
        btnMul = findViewById<Button>(R.id.BtnMul)
        btnDiv = findViewById<Button>(R.id.BtnDiv)


        textResult = findViewById<TextView>(R.id.TextResult)

        btnAdd.setOnTouchListener{ view, motionEvent ->
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()

            try{
                result = num1.toInt() + num2.toInt()
                btnAdd.isClickable = true
                textResult.setText("계산 결과: "+result.toString())
                edit1.setText(result.toString())
                edit2.setText("")
                number++
            }catch(e: Exception){
                result = null
                btnAdd.isClickable = false
            }

            false
        }

        btnSub.setOnTouchListener{ view, motionEvent ->
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()

            try{
                result = num1.toInt() - num2.toInt()
                btnSub.isClickable = true
                textResult.setText("계산 결과: "+result.toString())
                edit1.setText(result.toString())
                edit2.setText("")
                number++
            }catch(e: Exception){
                result = null
                btnSub.isClickable = false
            }
            false
        }

        btnMul.setOnTouchListener{ view, motionEvent ->
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()

            try{
                result = num1.toInt() * num2.toInt()
                btnMul.isClickable = true
                textResult.setText("계산 결과: "+result.toString())
                edit1.setText(result.toString())
                edit2.setText("")
                number++
            }catch(e: Exception){
                result = null
                btnMul.isClickable = false
            }
            false
        }

        btnDiv.setOnTouchListener{ view, motionEvent ->
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()

            try{
                result = num1.toInt() / num2.toInt()
                btnDiv.isClickable = true
                textResult.setText("계산 결과: "+result.toString())
                edit1.setText(result.toString())
                edit2.setText("")
                number++
            }catch(e: Exception){
                result = null
                btnDiv.isClickable = false
            }
            false
        }

    }
}
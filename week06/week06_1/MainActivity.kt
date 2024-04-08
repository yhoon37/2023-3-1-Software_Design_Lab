package com.example.week06_1
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.btn_main)

        btn.setOnClickListener{
            val intent = Intent(this, SubActivity::class.java)  // Intent 객체 선언
            startActivity(intent)   //SubActivity 클래스를 포함하는 Intent 시작
        }
    }
}

package com.example.basicandroid11

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    private lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        tvResult = findViewById(R.id.tvResult)

        val intent4 = intent
        val numA =  intent4.getStringExtra("numA")
        val numB = intent4.getStringExtra("numB")
        if(numA != null && numB!= null){
            val sum = numA.toInt() + numB.toInt()
            tvResult.text = "Tổng của A + B = $sum"
        }
        Log.e("M", (numA + numB).toString())
    }
}
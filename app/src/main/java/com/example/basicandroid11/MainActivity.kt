package com.example.basicandroid11

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var edtNumA: EditText
    private lateinit var edtNumB: EditText
    private lateinit var btnCal : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "On Creat",Toast.LENGTH_LONG).show()
        btn1 = findViewById(R.id.btnMain)
        edtNumA = findViewById(R.id.edtNumA)
        edtNumB = findViewById(R.id.edtNumB)
        btnCal = findViewById(R.id.btnCal)
        // goi man hinh 2 tu main1
        btn1.setOnClickListener {
            val intent1: Intent = Intent(this,MainActivity2::class.java)
            startActivity(intent1)
        }

        btnCal.setOnClickListener {
            val numA = edtNumA.text.toString()
            val numB = edtNumB.text.toString()
            val intent3:Intent = Intent(this, MainActivity3::class.java)
            intent3.putExtra("numA", numA)
            intent3.putExtra("numB", numB)
            startActivity(intent3)
        }
    }

    override fun onStart() {

        super.onStart()
        Toast.makeText(this,"On Start", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {

        super.onStop()
        Toast.makeText(this, "on Stop", Toast.LENGTH_LONG).show()


    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "on Resume", Toast.LENGTH_LONG).show()


    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"on Pause", Toast.LENGTH_LONG).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "on Destroy", Toast.LENGTH_LONG).show()

    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"on Restart", Toast.LENGTH_LONG).show()
    }
}
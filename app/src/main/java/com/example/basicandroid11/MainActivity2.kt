package com.example.basicandroid11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    private lateinit var btn2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btn2 = findViewById(R.id.btnMain2)
        btn2.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
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
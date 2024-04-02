package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.btn2
import kotlinx.android.synthetic.main.custome_one.custome

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn2.setOnClickListener(){
            Toast(this).apply {
                duration=Toast.LENGTH_SHORT
                view = layoutInflater.inflate(R.layout.custome_one,custome)
                show()
            }
        }
    }
}
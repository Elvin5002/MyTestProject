package com.elvin.mytestproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myList = arrayListOf(10, 20, 30, 40)

        for(num in myList){
            println(num)
        }
    }
}
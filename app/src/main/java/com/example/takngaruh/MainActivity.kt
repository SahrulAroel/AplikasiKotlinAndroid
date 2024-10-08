package com.example.takngaruh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    private lateinit var tvCounter: TextView
    private lateinit var btnAddNumber: Button
    private lateinit var SubtractButton: Button
    private lateinit var btnReset: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Layout Binding
        //ViewBinding
        tvCounter = findViewById(R.id.tvCounter)
        btnAddNumber = findViewById(R.id.btnAddNumber)
        SubtractButton = findViewById(R.id.SubtractButton)
        btnReset = findViewById(R.id.btnReset)
        tvCounter.text = "1"
    }
    fun addNumber(v: View){
        val currVal = tvCounter.text.toString().toInt()
        val nextVal = currVal + 1
        tvCounter.text = nextVal.toString()
    }
    fun substNumber(v: View){
        val currVal = tvCounter.text.toString().toInt()
        val nextVal = currVal - 1
        tvCounter.text = nextVal.toString()
    }
    fun resetNumber(v: View){
        tvCounter.text = "0"
    }
}

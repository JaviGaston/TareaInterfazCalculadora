package com.example.calculapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var firstNumber: StringBuilder? = null
    private var result: Double = 0.0
    private var operation: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(
            findViewById(R.id.main)
        ) { v: View, insets: WindowInsetsCompat ->
            val systemBars: Insets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val textView: TextView = findViewById(R.id.textView)
        val button0: Button = findViewById(R.id.button_0)
        button0.setOnClickListener {
            if (firstNumber != null) {
                firstNumber!!.append("0")
                textView.text = firstNumber.toString()
            }
        }
        val button1: Button = findViewById(R.id.button_1)
        button1.setOnClickListener {
            if (firstNumber != null) {
                firstNumber!!.append("1")
            } else {
                firstNumber = StringBuilder("1")
            }
            textView.text = firstNumber.toString()
        }
        val button2: Button = findViewById(R.id.button_2)
        button2.setOnClickListener {
            if (firstNumber != null) {
                firstNumber!!.append("2")
            } else {
                firstNumber = StringBuilder("2")
            }
            textView.text = firstNumber.toString()
        }
        val button3: Button = findViewById(R.id.button_3)
        button3.setOnClickListener {
            if (firstNumber != null) {
                firstNumber!!.append("3")
            } else {
                firstNumber = StringBuilder("3")
            }
            textView.text = firstNumber.toString()
        }
        val button4: Button = findViewById(R.id.button_4)
        button4.setOnClickListener {
            if (firstNumber != null) {
                firstNumber!!.append("4")
            } else {
                firstNumber = StringBuilder("4")
            }
            textView.text = firstNumber.toString()
        }
        val button5: Button = findViewById(R.id.button_5)
        button5.setOnClickListener {
            if (firstNumber != null) {
                firstNumber!!.append("5")
            } else {
                firstNumber = StringBuilder("5")
            }
            textView.text = firstNumber.toString()
        }
        val button6: Button = findViewById(R.id.button_6)
        button6.setOnClickListener {
            if (firstNumber != null) {
                firstNumber!!.append("6")
            } else {
                firstNumber = StringBuilder("6")
            }
            textView.text = firstNumber.toString()
        }
        val button7: Button = findViewById(R.id.button_7)
        button7.setOnClickListener {
            if (firstNumber != null) {
                firstNumber!!.append("7")
            } else {
                firstNumber = StringBuilder("7")
            }
            textView.text = firstNumber.toString()
        }
        val button8: Button = findViewById(R.id.button_8)
        button8.setOnClickListener {
            if (firstNumber != null) {
                firstNumber!!.append("8")
            } else {
                firstNumber = StringBuilder("8")
            }
            textView.text = firstNumber.toString()
        }
        val button9: Button = findViewById(R.id.button_9)
        button9.setOnClickListener {
            if (firstNumber != null) {
                firstNumber!!.append("9")
            } else {
                firstNumber = StringBuilder("9")
            }
            textView.text = firstNumber.toString()
        }
        val buttonDot: Button = findViewById(R.id.buttonDot)
        buttonDot.setOnClickListener {
            if (firstNumber != null) {
                firstNumber!!.append(".")
            } else {
                firstNumber = StringBuilder("0.")
            }
            textView.text = firstNumber.toString()
        }
        val buttonAC: Button = findViewById(R.id.buttonAC)
        buttonAC.setOnClickListener {
            firstNumber = null
            result = 0.0
            textView.text = "0"
        }
        val buttonAdd: Button = findViewById(R.id.buttonAdd)
        buttonAdd.setOnClickListener{
            if (firstNumber == null){
                firstNumber = StringBuilder("0")
            }
            result += firstNumber.toString().toDouble()
            firstNumber = null
            operation = "+"
        }
        val buttonSustract: Button = findViewById(R.id.buttonSustract)
        buttonSustract.setOnClickListener{
            if (result == 0.0){
                result += firstNumber.toString().toDouble()
            } else {
                result -= result.toString().toDouble()
            }
            firstNumber = null
            operation = "-"
        }
        val buttonEquals: Button = findViewById(R.id.buttonEquals)
        buttonEquals.setOnClickListener{
            if(firstNumber != null) {
                when (operation) {
                    "+" -> {
                        result += firstNumber.toString().toDouble()
                        firstNumber = null
                        textView.text = result.toString()
                    }
                    "-" -> {
                        result -= firstNumber.toString().toDouble()
                        firstNumber = null
                        textView.text = result.toString()
                    }
                    null -> textView.text = firstNumber.toString()
                }
            } else {
                if(result == (result - (result%1))){
                    textView.text = result.toInt().toString()
                } else {
                textView.text = result.toString()
                }
            }
        }
    }
}
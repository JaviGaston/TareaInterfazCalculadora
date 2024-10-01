package com.example.tareainterfazcalculadora

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    private var firstNumber: StringBuilder? = null
    private var result: Double = 0.0
    private var operation: String? = null
    private var isDecimal : Boolean = false
    private var contador : Int = 0;

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
            } else {
                firstNumber = StringBuilder("0")
            }
            textView.text = firstNumber.toString()
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
            if(!isDecimal){
                if (firstNumber != null) {
                firstNumber!!.append(".")
                } else {
                firstNumber = StringBuilder("0.")
                }
                isDecimal = true
                textView.text = firstNumber.toString()
            }
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
            isDecimal = false
        }
        val buttonSustract: Button = findViewById(R.id.buttonSustract)
        buttonSustract.setOnClickListener{
            if (firstNumber == null){
                firstNumber = StringBuilder("0")
            }
            result += firstNumber.toString().toDouble()
            firstNumber = null
            operation = "-"
            isDecimal = false
        }
        val buttonTimes: Button = findViewById(R.id.buttonTimes)
        buttonTimes.setOnClickListener{
            if (firstNumber == null){
                firstNumber = StringBuilder("0")
            }
            result += firstNumber.toString().toDouble()
            firstNumber = null
            operation = "*"
            isDecimal = false
        }
        val buttonDivide: Button = findViewById(R.id.buttonDivide)
        buttonDivide.setOnClickListener{
            if (firstNumber == null){
                firstNumber = StringBuilder("0")
            }
            result += firstNumber.toString().toDouble()
            firstNumber = null
            operation = "/"
            isDecimal = false
        }
        val buttonPi: Button = findViewById(R.id.buttonPi)
        buttonPi.setOnClickListener{
            if (!isDecimal && firstNumber == null){
                    firstNumber = StringBuilder("3.141592653")
                }
                isDecimal = true
                textView.text = firstNumber.toString()
        }

        val buttonSqrt: Button = findViewById(R.id.buttonSqrt)
        buttonSqrt.setOnClickListener{
            if (firstNumber == null){
                firstNumber = StringBuilder("0")
            }
            result =(firstNumber.toString().toDouble().pow(0.5))
                if(result == (result - (result%1))){
                    textView.text = (result.toInt()).toString()
                } else {
                    textView.text = result.toString()
                }
        }

        val buttonFactorial: Button = findViewById(R.id.buttonExclamation)
        buttonFactorial.setOnClickListener {
            if(isDecimal){
                textView.text = ("Error")
            }else if (firstNumber ==null || firstNumber.toString()=="0"){
                textView.text = "1"
            } else {
                result++
                for(i in 1..firstNumber.toString().toInt()){
                    result*=i
                }
                textView.text=result.toInt().toString()
                firstNumber = StringBuilder(result.toInt().toString())
                result = 0.0
            }
        }

        val buttonEquals: Button = findViewById(R.id.buttonEquals)
        buttonEquals.setOnClickListener{
            if(firstNumber != null) {
                when (operation) {
                    "+" -> {
                        result += firstNumber.toString().toDouble()
                        firstNumber = null
                    }

                    "-" -> {
                        result -= firstNumber.toString().toDouble()
                        firstNumber = null
                    }

                    "*" -> {
                        result *= firstNumber.toString().toDouble()
                        firstNumber = null
                    }

                    "/" -> {
                        result /= firstNumber.toString().toDouble()
                        firstNumber = null
                    }
                }
                isDecimal = false
            }
                if(result == (result - (result%1))){
                    textView.text = (result.toInt()).toString()
                    firstNumber = StringBuilder(result.toInt().toString())
                } else {
                textView.text = result.toString()
                    firstNumber = StringBuilder(result.toString())
                    isDecimal = true
                }
            operation = null
        }
    }
    override fun onResume(){
        super.onResume()
        Log.d("Debug","onResume")
        val text:TextView = findViewById(R.id.textView)
        text.text = contador.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        // Save the user's current game state.
        outState?.run {
            putInt("contador", contador)
        }
        // Always call the superclass so it can save the view hierarchy.
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        // Always call the superclass so it can restore the view hierarchy.
        super.onRestoreInstanceState(savedInstanceState)
        // Restore state members from saved instance.
        savedInstanceState?.run {
            contador = savedInstanceState.getInt("contador")
        }
    }
}
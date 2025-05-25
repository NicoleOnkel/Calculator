package com.example.calculator

import android.os.Bundle
import android.os.Trace.isEnabled
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.toString

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var tv = findViewById<TextView>(R.id.answercard)//Textview id
        val addbutton = findViewById<Button>(R.id.addsign)
        val subbutton = findViewById<Button>(R.id.subsign)
        val divbutton = findViewById<Button>(R.id.divsign)
        val mulbutton = findViewById<Button>(R.id.mulsign)
        val clearbutton = findViewById<Button>(R.id.clear)

        var firstnumbers = findViewById<EditText>(R.id.firstnumber)
        var secondnumbers = findViewById<EditText>(R.id.secondnumber)


        ///Clicking signs
        addbutton.setOnClickListener {
            tv.text = Add().toString()


        }

        subbutton.setOnClickListener {
            tv.text = Subtract().toString()


        }

        divbutton.setOnClickListener {
            tv.text = Divide().toString()


        }

        mulbutton.setOnClickListener {
            tv.text = Multiply().toString()


        }

        clearbutton.setOnClickListener {
            tv.text = ""
        }
    }


    fun Add(): Int? {
        val firstNumbersEditText = findViewById<EditText>(R.id.firstnumber)
        val secondNumbersEditText = findViewById<EditText>(R.id.secondnumber)

        val firstNumberString = firstNumbersEditText.text.toString()
        val secondNumberString = secondNumbersEditText.text.toString()

        val num1 = firstNumberString.toIntOrNull()
        val num2 = secondNumberString.toIntOrNull()

        if (num1 != null && num2 != null) {
            return num1 + num2
        }

        return null
    }



    fun Subtract(): Int {
        val firstNumber = findViewById<EditText>(R.id.firstnumber)
        val secondNumber = findViewById<EditText>(R.id.secondnumber)

        val firstNumberString = firstNumber.text.toString()
        val secondNumberString = secondNumber.text.toString()

        val num1 = firstNumberString.toIntOrNull()
        val num2 = secondNumberString.toIntOrNull()

        if (num1 != null && num2 != null) {
            return num1 - num2
        }
        return 0
    }


    fun Divide(): Int {
        val firstNumber = findViewById<EditText>(R.id.firstnumber)
        val secondNumber = findViewById<EditText>(R.id.secondnumber)

        val firstNumberString = firstNumber.text.toString()
        val secondNumberString = secondNumber.text.toString()

        val num1 = firstNumberString.toIntOrNull()
        val num2 = secondNumberString.toIntOrNull()

        if (num1 != null && num2 != null) {
            return num1 / num2
        }
        return 0
    }

    fun Multiply(): Int {
        val firstNumber = findViewById<EditText>(R.id.firstnumber)
        val secondNumber = findViewById<EditText>(R.id.secondnumber)

        val firstNumberString = firstNumber.text.toString()
        val secondNumberString = secondNumber.text.toString()

        val num1 = firstNumberString.toIntOrNull()
        val num2 = secondNumberString.toIntOrNull()

        if (num1 != null && num2 != null) {
            return num1 * num2
        }
        return 0
    }

}
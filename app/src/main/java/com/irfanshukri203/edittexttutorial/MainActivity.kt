package com.irfanshukri203.edittexttutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    fun addOperator(firstNumber: Int, secondNumber: Int) {
        val result = firstNumber + secondNumber

        txtResult.text = result.toString()
    }

    fun minusOperator(firstNumber: Int, secondNumber: Int) {
        val result = firstNumber - secondNumber

        txtResult.text = result.toString()
    }

    fun multipleOperator(firstNumber: Int, secondNumber: Int) {
        val result = firstNumber * secondNumber

        txtResult.text = result.toString()
    }

    fun divisionOperator(firstNumber: Int, secondNumber: Int) {
        val result = firstNumber / secondNumber

        txtResult.text = result.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener{
            val firstNumber = etFirstNumber.text.toString().toInt()
            val secondNumber = etSecondNumber.text.toString().toInt()

            addOperator(firstNumber, secondNumber)
        }

        btnMinus.setOnClickListener{
            val firstNumber = etFirstNumber.text.toString().toInt()
            val secondNumber = etSecondNumber.text.toString().toInt()

            minusOperator(firstNumber, secondNumber)
        }

        btnMultiple.setOnClickListener {
            val firstNumber = etFirstNumber.text.toString().toInt()
            val secondNumber = etSecondNumber.text.toString().toInt()

            multipleOperator(firstNumber, secondNumber)
        }

        btnDivide.setOnClickListener {
            val firstNumber = etFirstNumber.text.toString().toInt()
            val secondNumber = etSecondNumber.text.toString().toInt()

            divisionOperator(firstNumber, secondNumber)
        }
    }
}
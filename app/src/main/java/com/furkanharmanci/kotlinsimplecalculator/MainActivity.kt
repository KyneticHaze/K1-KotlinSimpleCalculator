package com.furkanharmanci.kotlinsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.furkanharmanci.kotlinsimplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun addValue(view : View) {
        number1 = binding.firstValue.text.toString().toIntOrNull()
        number2 = binding.secondValue.text.toString().toIntOrNull()


        if (number1 != null && number2 != null) {
            result = number1!! + number2!!
            binding.resultText.text = "Result: ${result}"
        } else {
            binding.resultText.text = "Enter Number!"
        }
    }
    fun minusValue(view : View) {
        number1 = binding.firstValue.text.toString().toIntOrNull()
        number2 = binding.secondValue.text.toString().toIntOrNull()


        if (number1 != null && number2 != null) {
            result = number1!! - number2!!
            binding.resultText.text = "Result: ${result}"
        } else {
            binding.resultText.text = "Enter Number!"
        }

    }
    fun timesValue(view : View) {
        number1 = binding.firstValue.text.toString().toIntOrNull()
        number2 = binding.secondValue.text.toString().toIntOrNull()


        if (number1 != null && number2 != null) {
            result = number1!! * number2!!
            binding.resultText.text = "Result: ${result}"
        } else {
            binding.resultText.text = "Enter Number!"
        }
    }
    fun divideValue(view : View) {
        number1 = binding.firstValue.text.toString().toIntOrNull()
        number2 = binding.secondValue.text.toString().toIntOrNull()


        if (number1 != null && number2 != null) {
            result = number1!! / number2!!
            binding.resultText.text = "Result: ${result}"
        } else {
            binding.resultText.text = "Enter Number!"
        }
    }
}
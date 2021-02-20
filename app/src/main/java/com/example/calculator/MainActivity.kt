package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var exp: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun press(v: View) {
        val t: TextView = v as TextView
        exp += t.text.toString()
        var e: EditText = findViewById(R.id.editText)
        e.setText(exp)
    }

    fun calculate(view: View) {
        val parser = ExpressionParser()
        val result = parser.evaluate(exp)
        var e: EditText = findViewById(R.id.editText)
        e.setText(result.toString())
    }

    fun clear(view: View) {
        var e: EditText = findViewById(R.id.editText)
        e.setText("")
        exp = ""
    }

    //TODO: result is always a double
}
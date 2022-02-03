package com.example.sharedpreferencedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val saveBtn = findViewById<Button>(R.id.save)
        val getBtn = findViewById<Button>(R.id.get)
        val editText = findViewById<EditText>(R.id.edit)
        val tv = findViewById<TextView>(R.id.tv)

        MySharedPreference.init(this)
        
        saveBtn.setOnClickListener {
            MySharedPreference.str = editText.text.toString()
        }

        getBtn.setOnClickListener {
            tv.text = MySharedPreference.str
        }

    }
}
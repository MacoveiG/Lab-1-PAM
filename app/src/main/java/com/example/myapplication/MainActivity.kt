package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val detBtn = findViewById<Button>(R.id.detBtn)
        val textul = findViewById<EditText>(R.id.textul)
        val rezult = findViewById<TextView>(R.id.rezult)

        detBtn.setOnClickListener{
            var rez = 0
            val text = textul.text.toString()
            val list: List<String> = text.split(" ").toList()
            for (s in list){
                if ("a" in s || "A" in s){
                    rez += 1
                }
            }
            rezult.text = "'a' este in ".plus(rez).plus(" cuvinte")
        }
    }
}
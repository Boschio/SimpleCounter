package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addButton = findViewById<Button>(R.id.addButton)
        val textView = findViewById<TextView>(R.id.textView)
        val upgradeBtn = findViewById<Button>(R.id.upgradeBtn)
        var counter = 0
        addButton.setOnClickListener {
//            Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter++
            if (counter >= 100) {
                upgradeBtn.visibility = View.VISIBLE
            }
            textView.text = counter.toString()
        }

        upgradeBtn.setOnClickListener {
            upgradeBtn.visibility = View.INVISIBLE
            addButton.text="Add 2"
            addButton.setOnClickListener {
                counter+=2
                textView.text = counter.toString()
            }

        }

    }
}
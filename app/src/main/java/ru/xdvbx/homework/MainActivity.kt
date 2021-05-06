package ru.xdvbx.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val strHello = "Helloo, World!"
        val strName = "Dimon500"
        val intAge = 49
        val dblVolume = 0.7

        val strOutputText = strHello + "\n" + " I'm " + strName + "\n" + " I'm " + intAge + " y/o and I've got " + dblVolume + " of Ballantines!"

        val textView = findViewById<TextView>(R.id.txtOutput)
        textView.text = strOutputText

    }
}
package com.example.myapplication_first

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Name = findViewById<EditText>(R.id.editTextTextPersonName)
        val Boton = findViewById<Button>(R.id.boton1)
        val Mensagge = findViewById<TextView>(R.id.textView)
        Boton.setOnClickListener{
            val Mensaje : String
            Mensaje= "El mensaje ingresado es: "+ Name.text
            val toast1 = Toast.makeText(applicationContext, Mensaje, Toast.LENGTH_LONG)
            toast1.setGravity(Gravity.CENTER ,0,0)
            toast1.show()
        }
    }
}

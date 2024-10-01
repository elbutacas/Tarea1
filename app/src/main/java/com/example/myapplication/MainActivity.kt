package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.widget.TextView
import android.widget.Toast
import kotlin.coroutines.jvm.internal.CompletedContinuation.context

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
        val tvGreeting= findViewById<TextView>(R.id.tvGreeting)//<TextView> hace un cast de clase
        tvGreeting.text=getString(R.string.tvGreetingFinalText)

        //Eventos del botón
        val btnChangeGreeting = findViewById<TextView>(R.id.btSendMessage)
        tvGreeting.text=getString(R.string.tvGreeting)

        btnChangeGreeting.setOnClickListener {
            Toast.makeText(context: this, text: "Y ahora con el Contexto",Toast.LENGTH_LONG).show()
        //Toast necesita contexto, que es información sobre la propia activity, tema, permisos, etc...

        tvGreeting.setTextColor(Color.RED)

            // He tratado de solucionar los errores pero no entiendo por qué en la línea 31
            //del MainActivity me salta error en tvGreeting
        }



    }
}
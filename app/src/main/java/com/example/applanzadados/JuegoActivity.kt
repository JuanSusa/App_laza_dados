package com.example.applanzadados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class JuegoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego)


        val btnLanzar: Button = findViewById(R.id.buttonLanzar)

        btnLanzar.setOnClickListener {
            lanzarDados()
        }
    }

    private fun lanzarDados() {
        val numDados = randomDados(6)
        val textNum: TextView = findViewById(R.id.textNum)
        val imgDado: ImageView = findViewById(R.id.imageViewDado)

        when(numDados){
            1 -> imgDado.setImageResource(R.drawable.dado_1)
            2 -> imgDado.setImageResource(R.drawable.dado_2)
            3 -> imgDado.setImageResource(R.drawable.dado_3)
            4 -> imgDado.setImageResource(R.drawable.dado_4)
            5 -> imgDado.setImageResource(R.drawable.dado_5)
            6 -> imgDado.setImageResource(R.drawable.dado_6)
        }

        textNum.text = numDados.toString()
        //Toast.makeText(this, "Tu número es $numDados", Toast.LENGTH_SHORT).show()
    }

    private fun randomDados(max:Int):Int{
        return (1..max).random()
    }
}
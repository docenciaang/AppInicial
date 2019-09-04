package com.example.appinicial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
  lateinit var imDado: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imDado = findViewById(R.id.imDado)
        val botonLanzar: Button = findViewById(R.id.btLanzar)
        botonLanzar.text = "Lanzaaar"
        botonLanzar.setOnClickListener {

            lanzarDado()
      }
    }
    fun lanzarDado(){
        val caraValor = Random.nextInt(1,6)
       // Toast.makeText(this, "Dado sale ${caraValor.toString()}", LENGTH_SHORT).show()
        val queImagen = when(caraValor){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imDado.setImageResource(queImagen)
    }
}

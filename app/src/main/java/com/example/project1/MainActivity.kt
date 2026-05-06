package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnPatimiau = findViewById<Button>(R.id.btnPatimiau)
        val btnCatLover = findViewById<Button>(R.id.btnCatLovers)
        val btnMochi1 = findViewById<Button>(R.id.btnMochi1)
        val btnMochi2 = findViewById<Button>(R.id.btnMochi2)
        val btnMichiDango = findViewById<Button>(R.id.btnMichidango)
        val btnConchi = findViewById<Button>(R.id.btnConchirilakkuma)

        btnPatimiau.setOnClickListener {
            carrito.agregar(0)
            print(carrito.cantidad[0])
        }
        btnCatLover.setOnClickListener {
            carrito.agregar(1)
            print(carrito.cantidad[1])
        }
        btnMochi1.setOnClickListener {
            carrito.agregar(2)
            print(carrito.cantidad[2])
        }
        btnMochi2.setOnClickListener {
            carrito.agregar(3)
        }
        btnMichiDango.setOnClickListener {
            carrito.agregar(4)
        }
        btnConchi.setOnClickListener {
            carrito.agregar(5)
        }
    }
}
package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ticket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ticket)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val PrecioPatimiau = (carrito.cantidad[0] * 80)
        val PrecioComboCat = (carrito.cantidad[1] * 90)
        val PrecioMochi1 = (carrito.cantidad[2] * 80)
        val PrecioMochi2 = (carrito.cantidad[3] * 80)
        val PrecioMichi = (carrito.cantidad[4] * 30)
        val PrecioConchi = (carrito.cantidad[5] * 25)

        val Importe1 = PrecioPatimiau * 0.16
        val Importe2 = PrecioComboCat * 0.16
        val Importe3 = PrecioMochi1 * 0.16
        val Importe4 = PrecioMochi2 * 0.16
        val Importe5 = PrecioMichi * 0.16
        val Importe6 = PrecioConchi * 0.16

        val Total1 = PrecioPatimiau + Importe1
        val Total2 = PrecioComboCat + Importe2
        val Total3 = PrecioMochi1 + Importe3
        val Total4 = PrecioMochi2 + Importe4
        val Total5 = PrecioMichi + Importe5
        val Total6 = PrecioConchi + Importe6

        val Total = Total1 + Total2 + Total3 + Total4 + Total5 + Total6

        val btnNuevaOrden = findViewById<Button>(R.id.btnNuevaOrden)
        btnNuevaOrden.setOnClickListener {
            carrito.cantidad.fill(0)
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }

    }
}
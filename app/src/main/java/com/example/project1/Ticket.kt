package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextClock
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

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

        val txtCantPatiMiau = findViewById<TextView>(R.id.txtCantPati)
        val txtCantCombo = findViewById<TextView>(R.id.txtCantCombo)
        val txtCantMochi1 = findViewById<TextView>(R.id.txtCantMochi1)
        val txtCantMochi2 = findViewById<TextView>(R.id.txtCantMochi2)
        val txtCantMichi = findViewById<TextView>(R.id.txtCantMichi)
        val txtCantConchi = findViewById<TextView>(R.id.txtCantConchi)
        val txtImporte1 = findViewById<TextView>(R.id.txtImporte1)
        val txtImporte2 = findViewById<TextView>(R.id.txtImporte2)
        val txtImporte3 = findViewById<TextView>(R.id.txtImporte3)
        val txtImporte4 = findViewById<TextView>(R.id.txtImporte4)
        val txtImporte5 = findViewById<TextView>(R.id.txtImporte5)
        val txtImporte6 = findViewById<TextView>(R.id.txtImporte6)
        val txtTotal1 = findViewById<TextView>(R.id.txtTotal1)
        val txtTotal2 = findViewById<TextView>(R.id.txtTotal2)
        val txtTotal3 = findViewById<TextView>(R.id.txtTotal3)
        val txtTotal4 = findViewById<TextView>(R.id.txtTotal4)
        val txtTotal5 = findViewById<TextView>(R.id.txtTotal5)
        val txtTotal6 = findViewById<TextView>(R.id.txtTotal6)
        val txtTotal = findViewById<TextView>(R.id.txtTotal)

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

        txtCantPatiMiau.text = "Cafe PatiMiau\t x${carrito.cantidad[0]}  "
        txtCantCombo.text = "Combo Catlover\t x${carrito.cantidad[1]}  "
        txtCantMochi1.text = "Pack Mochis 1\t x${carrito.cantidad[2]}  "
        txtCantMochi2.text = "Pack Mochis 2\t x${carrito.cantidad[3]}  "
        txtCantMichi.text = "Michidango\t x${carrito.cantidad[4]}  "
        txtCantConchi.text = "Conchirilakkuma\t x${carrito.cantidad[5]}  "
        txtImporte1.text = Importe1.toString()
        txtImporte2.text = Importe2.toString()
        txtImporte3.text = Importe3.toString()
        txtImporte4.text = Importe4.toString()
        txtImporte5.text = Importe5.toString()
        txtImporte6.text = Importe6.toString()
        txtTotal1.text = Total1.toString()
        txtTotal2.text = Total2.toString()
        txtTotal3.text = Total3.toString()
        txtTotal4.text = Total4.toString()
        txtTotal5.text = Total5.toString()
        txtTotal6.text = Total6.toString()
        txtTotal.text = Total.toString()

        val btnNuevaOrden = findViewById<Button>(R.id.btnNuevaOrden)
        btnNuevaOrden.setOnClickListener {
            carrito.cantidad.fill(0)
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }

    }
}
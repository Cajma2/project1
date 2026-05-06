package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class Compra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_compra)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Boton Comprar
        val btnComprar = findViewById<Button>(R.id.btnCompra)
        btnComprar.setOnClickListener {
            val intent = Intent(this, Ticket::class.java)
            startActivity(intent)
        }

        //Café Patimiau
        val btnSumPatiMiau = findViewById<Button>(R.id.btnSumPatimiau)
        val btnResPatiMiau = findViewById<Button>(R.id.btnResPatiMiau)
        val txtPatiMiau = findViewById<TextView>(R.id.txtPatiMiau)
        val imgPatiMiau = findViewById<ImageView>(R.id.imgPatimiau)

        //Combo CatLover
        val btnSumCatLovers = findViewById<Button>(R.id.btnSumCatLovers)
        val btnResCatLovers = findViewById<Button>(R.id.btnResCatLovers)
        val txtCatLovers = findViewById<TextView>(R.id.txtCatLover)
        val imgCatLovers = findViewById<ImageView>(R.id.imgCatLovers)

        //Pack Mochi 1
        val btnSumMochi1 = findViewById<Button>(R.id.btnSumMochi1)
        val btnResMochi1 = findViewById<Button>(R.id.btnResMochi1)
        val txtMochi1 = findViewById<TextView>(R.id.txtMochi1)
        val imgMochi1 = findViewById<ImageView>(R.id.imgMochi1)

        //Pack Mochi 2
        val btnSumMochi2 = findViewById<Button>(R.id.btnSumMochi2)
        val btnResMochi2 = findViewById<Button>(R.id.btnResMochi2)
        val txtMochi2 = findViewById<TextView>(R.id.txtMochi2)
        val imgMochi2 = findViewById<ImageView>(R.id.imgMochi2)

        //Michidango
        val btnSumMichi = findViewById<Button>(R.id.btnSumMichi)
        val btnResMichi = findViewById<Button>(R.id.btnResMichi)
        val txtMichi = findViewById<TextView>(R.id.txtMichiDango)
        val imgMichi = findViewById<ImageView>(R.id.imgMichiDango)

        //Conchirilakkuma
        val btnSumConchi = findViewById<Button>(R.id.btnSumConchi)
        val btnResConchi = findViewById<Button>(R.id.btnResConchi)
        val txtConchi = findViewById<TextView>(R.id.txtConchi)
        val imgConchi = findViewById<ImageView>(R.id.imgConchi)

        //Inicializar TextView
        txtPatiMiau.text = "Café Patimiau ${carrito.cantidad[0]}"

        txtCatLovers.text = "Combo catlovers ${carrito.cantidad[1]}"
        txtMochi1.text = "Pack mochis 1 ${carrito.cantidad[2]}"
        txtMochi2.text = "Pack mochis 2 ${carrito.cantidad[3]}"
        txtMichi.text = "Michidango ${carrito.cantidad[4]}"
        txtConchi.text = "Conchirilakkuma ${carrito.cantidad[5]}"

        //Sumas y Restas
        btnSumPatiMiau.setOnClickListener {
            carrito.cantidad[0]++
            txtPatiMiau.text = "Café Patimiau ${carrito.cantidad[0]}"
        }

        btnSumCatLovers.setOnClickListener {
            carrito.cantidad[1]++
            txtCatLovers.text = "Combo catlovers ${carrito.cantidad[1]}"
        }

        btnSumMochi1.setOnClickListener {
            carrito.cantidad[2]++
            txtMochi1.text = "Pack mochis 1 ${carrito.cantidad[2]}"
        }

        btnSumMochi2.setOnClickListener {
            carrito.cantidad[3]++
            txtMochi2.text = "Pack mochis 2 ${carrito.cantidad[3]}"
        }

        btnSumMichi.setOnClickListener {
            carrito.cantidad[4]++
            txtMichi.text = "Michidango ${carrito.cantidad[4]}"
        }

        btnSumConchi.setOnClickListener {
            carrito.cantidad[5]++
            txtConchi.text = "Conchirilakkuma ${carrito.cantidad[5]}"
        }

        btnResPatiMiau.setOnClickListener {
            if (carrito.cantidad[0] > 0) carrito.cantidad[0]--
            txtPatiMiau.text = "Café Patimiau ${carrito.cantidad[0]}"
        }

        btnResCatLovers.setOnClickListener {
            if (carrito.cantidad[1] > 0) carrito.cantidad[1]--
            txtCatLovers.text = "Combo catlovers ${carrito.cantidad[1]}"
        }

        btnResMochi1.setOnClickListener {
            if (carrito.cantidad[2] > 0) carrito.cantidad[2]--
            txtMochi1.text = "Pack mochis 1 ${carrito.cantidad[2]}"
        }

        btnResMochi2.setOnClickListener {
            if (carrito.cantidad[3] > 0) carrito.cantidad[3]--
            txtMochi2.text = "Pack mochis 2 ${carrito.cantidad[3]}"
        }

        btnResMichi.setOnClickListener {
            if (carrito.cantidad[4] > 0) carrito.cantidad[4]--
            txtMichi.text = "Michidango ${carrito.cantidad[4]}"
        }

        btnResConchi.setOnClickListener {
            if (carrito.cantidad[5] > 0) carrito.cantidad[5]--
            txtConchi.text = "Conchirilakkuma ${carrito.cantidad[5]}"
        }

    }
}
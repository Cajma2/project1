package com.example.project1

object carrito {
    val cantidad = IntArray(6)

    fun agregar(index : Int){
        cantidad[index]++
    }
    fun restar(index : Int){
        if (cantidad[index] > 0){
            cantidad[index]--
        }
    }
}
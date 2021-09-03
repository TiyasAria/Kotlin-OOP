package application

import data.Shape
import data.bentuk
import data.segitiga

fun main() {
    val saya = Shape()
    println(saya.sisi)

    val saya1 = bentuk()
    println(saya1.sisi)

    val saya2 = segitiga()
    println(saya2.sisi)

    //hasil dari super properties
    println("sisi nya ${saya2.sisi}")
    println("supersisi nya ${saya2.superSisi}")

    //hasil dari super func
    saya2.printName()


}
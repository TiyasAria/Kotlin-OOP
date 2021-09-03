package application

import data.Laptop

fun main() {
    val acer = Laptop("acer",2020, 4_000_000)

    println(acer.brand)
    println(acer.year)
    println(acer.price)

    val HP = Laptop("hP",2010)

    println(HP.brand)
    println(HP.year)

}
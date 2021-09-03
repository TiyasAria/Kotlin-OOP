package application

import data.smartphone

fun main() {
    val samsung = smartphone("vivo y12", "android lolipop")
    println(samsung.brand)
    println(samsung.os)
    //println any class
    println(samsung.toString())
    println(samsung.hashCode())
    println(samsung.equals(samsung))




}
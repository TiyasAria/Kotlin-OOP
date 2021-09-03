package application

import data.sahabat1
import data.sahabat2
import data.sahabat3

fun main() {
    //output inheritance
    val sahabat1 = sahabat1("asma")
    sahabat1.sayHello("tiyas")

    val sahabat2 = sahabat2("astri")
    sahabat2.sayHello("aria")


    val sahabat3 = sahabat3("dian")
    sahabat3.sayHello("pratiwi")

    //super keyword properties
    println("sahabat ke-2 beraasal dari ${sahabat1.asal}")
    println("sahabat ke-2 beraasal dari super asal ${sahabat1.superAsal}")

    // super keyword func
    sahabat2.sayHello("rangga")


}
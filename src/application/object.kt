package application

import data.Person

fun main() {
    //kita akan memisahkan object dan class dalam beda package agar mudah dipanggil ketika scrip banyak
    // membuat object dan memanggil class
    val tiyas = Person()

    //cara memanggil dengan ketikan object.properties = data
    tiyas.firstName = "tiyas "
    tiyas.middleName = "aria"
    tiyas.lastName = "pratiwi"
    println(tiyas.firstName)
    println(tiyas.middleName)
    println(tiyas.lastName)

    //cara ngeprint menggunakan function
    tiyas.sayHello("rangga")
    tiyas.berjalan()
     val fullname = tiyas.getFullName()
    println(fullname)

    // ngeprint func overloading
    tiyas.sayHello("rangga", 21)
    // println dg this
    tiyas.sayHello("rangga", "Bekasi")





}
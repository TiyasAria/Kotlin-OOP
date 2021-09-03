package application

import data.MyFamily

fun main() {
    // cetak second cons
    val mySelf = MyFamily("sudari","sri sumarti ")
    println(mySelf.ayah)
    println(mySelf.ibu)

    // cetak func overloading
    mySelf.sayHii("tiyas")
    mySelf.sayHii("tiyas","sragen")




}
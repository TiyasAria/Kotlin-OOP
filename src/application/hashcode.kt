package application

import data.MahasiswiIDN

fun main() {
    val mahasiswi = MahasiswiIDN("Tiyas","Sragen")
    val mahasiswi2 = MahasiswiIDN("Tiyas","Surakarta")

    println(mahasiswi.hashCode())
    println(mahasiswi2.hashCode())
    println( mahasiswi.hashCode() == mahasiswi2.hashCode()) //false walaupun sudah di equals krana belum di override
}
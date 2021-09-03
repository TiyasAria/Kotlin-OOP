package application

import data.MahasiswiIDN

fun main() {
    //tanpa equals dulu
    val mahasiswi = MahasiswiIDN("Tiyas","Sragen")
    val mahasiswi2 = MahasiswiIDN("Tiyas","Surakarta")

    println(mahasiswi == mahasiswi2) // false karena berbeda oject walau atributnya(isinya sama)
    println(mahasiswi == mahasiswi) //true karena sama objectnya
    println(mahasiswi2 == mahasiswi2) //true karena sama objectnya

    /*
    dengan menggunakan equals kita bisa membandingkan 2 object yang isinya sama sehingga
    bisa menghasilkan true nanti, 
     */

}
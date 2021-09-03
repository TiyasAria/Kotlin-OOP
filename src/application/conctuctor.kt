package application

import data.Car

fun main() {
    // membuat object dan memanggil dari classnya "car" dan mengisi datanya
    val pajero = Car("Toyota")
    //script ini untuk mengganti tahun yang telah kita tetapkan tadi diclas, (object.properties = data baru)
    pajero.year = 2018
    //untuk menampilkan data nya di println (object.properties)
    println(pajero.brand)
    println(pajero.year)

//memanggil si constractor dengan mengganti tahunnya
    val almaz = Car("wuling",2019)
    println(almaz.brand)
    println(almaz.year)
}
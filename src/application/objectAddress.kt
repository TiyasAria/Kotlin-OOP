package application

import data.Address

fun main() {
    val alamat = Address("sepanjang jalan kenangan", "Bucin", "Bumi Cinta")
    println(alamat.street)
    println(alamat.city)
    println(alamat.country)
}
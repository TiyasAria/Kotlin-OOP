package application

import data.excecutivePelanggan
import data.premiumPelanggan

fun main() {
    val pelanggan1 = premiumPelanggan("tiyas aria")
    println(pelanggan1.nama)

    val pelanggan2 = excecutivePelanggan("tiyas aria ", 1_000_000)
    println(pelanggan2.nama)
    println(pelanggan2.keseimbangan)
}
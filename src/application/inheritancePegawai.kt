package application

import data.Manager
import data.vicePresident

fun main() {
 val utama = Manager("tiyas")
    utama.sayHii("rangga")

    val ketua = vicePresident("aria")
    ketua.sayHii("narendra")
}
package application

import data.Register

fun main() {
    val daftar = Register("aria","aria345@gmail.com",
            "aria123", "123")
    println(daftar.username)
    println(daftar.email)
    println(daftar.password)
    println(daftar.kode)

    val register = Register("tiyas", "tiyasria123@gmail.com")
    println(register.username)
    println(register.email)

}
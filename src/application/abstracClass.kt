package application


import data.cat
import data.negara
import data.provinsi

fun main() {
    // val negara1 = negara() //error karena ini abstrac
    val negara1 = provinsi("jawa tengah")
    println(negara1.nama)
    val negara2 = negara("Indonesia")
    println(negara2.nama)

    //ngeprint properties dan fun
    val hewan = cat()
    hewan.berjalan()

}
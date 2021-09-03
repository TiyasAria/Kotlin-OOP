package application

import data.HandPhone
import data.smartphone
import data.superManager

/* dalam OOP kita akan banyak menemui banyak class dan inheritance
disinilah kita akan butuh check tipe data dan konversi tipe data dalam bentuk parameter
 */
/*
- is digunakan untuk mengecek apakah sebuah data merupakan tipe data tertentu
- !is digunakan untuk mengecek apakah sebuah data bukan merupakan tipe data tertentu

kotlin punya konversi data secara otomatis setelah kita melakukan pengecekan data menggunakan
is, maka secara otomatis tipe data yg kita cek akan menjadi tipe data yg kita cek
 */
fun printObject(any : Any){
    //lakukan pengecekan menggunakan is
    if (any is HandPhone)  { //ini dinamakan dengan pengeceken
        println("handphone dengan merek ${any.brand}")//smart cast
    }else if (any is smartphone){
        println("smartphone dengan merek ${any.brand} dan dengan OS ${any.os}") //ini dinamakan dengan smart cast
    }else {
        println(any)
    }
    // membuat func dg parameter any yang bisa menerima semua tipe data
}


//cast di when expressiion
fun printObjectdenganWhen(any : Any){
    //lakukan pengecekan menggunakan is
    when (any) {
        is HandPhone -> println("handphone dengan merek ${any.brand}")//smartcast
        is smartphone -> println("smartphone dengan merek ${any.brand} dan dengan OS ${any.os}")
        else -> println(any)
    }
    // membuat func dg parameter any yang bisa menerima semua tipe data
}

//unsafe cast
//konversi data secara paksa menggunakan as , hal ini tidak aman jika ternyata tipe data tidak sesuai
fun printAS (any: Any){
    val nilai = any as String
    println(nilai)
}

// safe nullable cast
// karena as tidak aman maka bisa aman dg keyword as?, dg as? secara otomatis jika gagal konversi akan null bukan error
fun printASnull (any: Any){
    val nilai = any as? String
    println(nilai)
}

fun main() {
    /*
    karena pakai any jadi bisa ngeprintln semua tipe data baik itu integer, string,dll
    atau juga bisa ngeprintln dari class yg kita buat di sini .
     */

    //print menggunakan as
    printAS("tiyas aria")
    // printAS(1) // dia tidak sukses  error  karena makasin int

    //print dg as?
    printASnull("rangga")
    printASnull(2)

    printObject(1)
    printObject("tiyas aria")
    printObject(HandPhone("vivo y12"))
    printObject(smartphone("samsung", "android pie"))
    printObject(superManager("Tiyas aria"))

    //print object when
    printObjectdenganWhen(2)
    printObjectdenganWhen("rangga")
    printObjectdenganWhen(HandPhone("samsung a3"))
    printObjectdenganWhen(smartphone("vivoy12","android pie"))
}
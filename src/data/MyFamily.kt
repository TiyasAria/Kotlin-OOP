package data

open class MyFamily ( val ayah : String, val ibu : String, val anak1 : String) {
    //secondary cons
    constructor(ayah: String,ibu: String) : this(ayah,ibu,"tiyas Aria")
    // func overloading
    fun sayHii(nama : String){
        println("hii my name is $nama, and my father his name is $ayah")
    }
    fun sayHii(nama : String, alamat : String){
        println("hii my name is $nama i come from $alamat, and my father his name is $ayah")
    }

}

fun main(){
    // cetak second cons
    val mySelf = MyFamily("sudari","sri sumarti ")
    println(mySelf.ayah)
    println(mySelf.ibu)
    println(mySelf.anak1)

}



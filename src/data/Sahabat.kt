package data

//inheritance tugas haura
open class Sahabat ( val nama : String) {
   open  val asal  = "Surakarta"
   open  fun sayHello (nama : String){
        println("hello my name is $nama this is my freind her name is ${this.nama}")
    }
}

class sahabat1(nama: String) : Sahabat(nama){
    override val asal = "tegal"
    //super keyword
    val superAsal = super.asal
}

class sahabat2(nama: String) : Sahabat(nama){
    //super keyword untuk func
    override fun sayHello(nama: String) {
        println("this is second best freind")
        super.sayHello(nama)
    }
}
class sahabat3(nama: String) : Sahabat(nama){

}

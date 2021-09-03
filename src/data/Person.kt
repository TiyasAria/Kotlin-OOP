package data

class Person  {

    //membuat properties
    var firstName = ""
    var middleName = ""
    var lastName = ""
    //membuat function

    fun sayHello (name : String){
        println("Hi $name, perkenalkan nama saya $firstName")
    }

    //func overloading (membuat function dengan nama sama tapi harus berbeda jumlah parameternya
    // /jenis paramaternya )
    fun sayHello (name : String, umur : Int){
        println("Hi $name umur kamu $umur, perkenalkan nama saya $firstName")
    }

    fun sayHello (firstname : String,alamat : String){
        println("Hi $firstname kamu dari $alamat , perkenalkan nama saya ${this.firstName}")
    }

    fun berjalan(){
        println("aku berjalan diatas awan")
    }

    fun getFullName() : String{
        return "$firstName $middleName $lastName"
    }

}

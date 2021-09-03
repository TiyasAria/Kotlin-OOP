package data

class Buah (paramName : String, paramJenis : String){
    var name = paramName
    var jenis = paramJenis
}

fun main (){
     val buah = Buah("APel","Buah Manis")


    println(buah.name)
    println(buah.jenis)
}

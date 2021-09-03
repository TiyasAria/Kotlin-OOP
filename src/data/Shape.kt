package data

// properties overriding = (membuat ulang properti di class child
// prinsipnya sama dengan func ovveriding)
open class Shape {
    open val sisi = 3
    open fun printName(){
        println("this is shape ")
    }
}
class bentuk : Shape(){
    override val sisi = 5
}

class segitiga : Shape(){
    override val sisi = 6
    // contoh super keyword
    val superSisi = super.sisi //berisi dari propertiesnya si parent yakni 3

    // contoh super menggunakan fun
    override fun printName() {
        println("this is rectangle")
        super.printName()
    }
}

// SUPER KEYWORD
/**
kadang kita ingin mengakses fun atau properties milik class parent yang sudah kita buat ulang
oleh class child,untuk mengakses fun atau properties milik class parent bisa menggunakan kata
"super"
 */
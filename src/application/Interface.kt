package application

interface Interaction {
    val name : String
    fun  sayHello(name: String)
}

class Human (override val name: String) : Interaction {
    override fun sayHello(name: String) {
        println("hello $name, my name is ${this.name}")
    }
}

fun main () {
    val manusia = Human("Tiyas")
    manusia.sayHello("rangga")

}
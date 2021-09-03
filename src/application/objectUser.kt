package application

import data.User

fun main() {
    val user = User("tiyas aria", "tiyas1111")
    println(user.username)
    println(user.password)
    //println dengan this
    user.sayHello("Rangga")

}
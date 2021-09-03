package application

import data.Note
import data.bigNote

fun main() {
    val note= Note("belajar kotlin OOP")
    println(note.title) // untuk getter
    note.title = "" // untuk setter,
    val bigNote = bigNote("belajar kotlin kuh")
    println(bigNote.title)
    println(bigNote.bigTittle)

}
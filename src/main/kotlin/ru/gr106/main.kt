package ru.gr106

fun display_information(some: List<AStudent>){
    some.forEach{println(it)}
}
fun main() {
    val stds = mutableListOf<AStudent>()
    stds.add(AStudentClass("Некто Н.Н."))
    println("")
    stds.forEach{
        println(it)
    }
    display_information(stds)
    display_information(stds)
    stds.add(AStudentClass("Нагадил"))
}
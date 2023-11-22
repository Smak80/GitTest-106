package ru.gr106


fun main() {
    val stds = mutableListOf<AStudent>()
    stds.add(AStudentClass("Некто Н.Н."))
    stds.forEach{
        println(it)
    }
}
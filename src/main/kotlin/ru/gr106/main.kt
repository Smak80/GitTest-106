package ru.gr106

fun display_information(some: List<AStudent>){
    some.forEach{println(it)}
}
fun main() {
    val stds = mutableListOf<AStudent>()
    stds.add(AStudentClass("Некто Н.Н.", 12u, "05-004"))
    stds.add(AStudentClass("Второй Н.Н", 16u, "05-005"))
    stds.forEach{
        println(it)
    }
    display_information(stds)
}
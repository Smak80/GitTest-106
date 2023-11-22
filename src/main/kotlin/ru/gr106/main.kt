package ru.gr106



fun printStudents(students:List<AStudent>){
    for (student in students){
        println(student)
    }
}

fun main() {
    val stds = mutableListOf<AStudent>()
    stds.add(SuperStudent("Jack", mapOf("chemistry" to 5,"Math" to 4)))
    stds.add(SuperStudent("Robin", mapOf("PE" to 5,"Literature" to 5)))
    printStudents(stds)
}
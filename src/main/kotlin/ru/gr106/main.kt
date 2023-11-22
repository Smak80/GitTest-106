package ru.gr106


fun main() {
    val stds = mutableListOf<AStudent>()
    stds.add(Student("Иванов И. И."))
    stds.add(Student("Петров П. П."))
    stds.add(Student("Галимуллин Р. Ш."))
    stds.forEach {
        println(it)
    }
}
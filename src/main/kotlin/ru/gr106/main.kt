package ru.gr106


fun main() {
    val stds = mutableListOf<AStudent>()
    stds.add(Student("Ivan", 15u))
    stds.add(Student("Dima", 21u))
    stds.add(Student("Vova", 20u))
    for (s in stds) {
        println(s)
    }
}
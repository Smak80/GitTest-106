package ru.gr106


fun main() {
    val stds = mutableListOf<AStudent>()
    val std3 = Student("Аня", 15, "111")
    val std1 = Student("Карина", 18, "555")
    val std2 = Student("Мария", 20, "543")
    stds.add(std1)
    stds.add(std2)
    stds.add(std3)
    std3.PrintStudentInfo(stds)
}
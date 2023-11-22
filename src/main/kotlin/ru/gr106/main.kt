package ru.gr106


fun main() {
    val stds = mutableListOf<AStudent>()
    val std1 = Student("Мария", 16, "194")
    val std2 = Student("Юлия", 17, "194")
    val std3 = Student("Анна", 16, "194")
    stds.add(std1)
    stds.add(std2)
    stds.add(std3)
    std1.PrintStudentInfo(stds)
}
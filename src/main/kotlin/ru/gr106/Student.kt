package ru.gr106

class Student(Name: String, Age: UInt, Group: String) : AStudent{
    override val name = Name
    override val age = Age
    fun PrintStudentsInfo(students: List<AStudent>){
        students.forEach { it -> println("Имя студента:" + " " + it.name + "\n") }
    }
}
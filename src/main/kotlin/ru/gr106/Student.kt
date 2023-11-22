package ru.gr106

class Student(Name: String, Age: UInt, Group: String) : AStudent{
    override val name = Name
    override var age = Age
    override var group = Group
    fun PrintStudentsInfo(students: List<AStudent>){
        students.forEach { it -> println("Имя студента:" + " " + it.name + "\n") }
    }
}
package ru.gr106

class Student(
    override val name: String,
    override var age: UInt,
    override var group: String = "05-106",
) : AStudent {
    override fun toString(): String {
        return "$name $age"
    }
}
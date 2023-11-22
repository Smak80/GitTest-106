package ru.gr106

class Student(override val name: String, override var age: UInt) : AStudent {
    override fun toString(): String {
        return "$name $age"
    }
}
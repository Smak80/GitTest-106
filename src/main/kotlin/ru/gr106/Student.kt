package ru.gr106

data class Student(
    override val name: String,
    override var age: UInt = 18u,
) : AStudent{
    override fun toString() = "$name: $age"
}
package ru.gr106

class AStudentClass(override val name: String, override var age: UInt, override var group: String) : AStudent  {
    override fun toString(): String{
        return name
    }
}
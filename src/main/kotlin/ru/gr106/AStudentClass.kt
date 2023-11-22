package ru.gr106

class AStudentClass(override val name: String) : AStudent  {
    override fun toString(): String{
        return name
    }
}
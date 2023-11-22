package ru.gr106

class SuperStudent(name:String, marks:Map<String,Int>) : AStudent{
    override val name: String = name
    var mmarks = mapOf<String,Int>()

    init {
        mmarks = marks
    }

    override fun toString(): String {
        return "This student is called $name. His marks: ${mmarks.entries}"
    }
}
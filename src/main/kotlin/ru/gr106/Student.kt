package ru.gr106

data class SuperStudent(override val name:String, val marks:Map<String,Int>, override var age:UInt ) : AStudent{
    //override val name: String = name
    //override var age: UInt = 18u
    override var group: String = "05-106"
    var mmarks = mapOf<String,Int>()

    init {
        mmarks = marks
    }

    override fun toString(): String {
        return "This student is called $name.He is $age years old. His marks: ${mmarks.entries}"
    }
}
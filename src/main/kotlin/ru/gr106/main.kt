package ru.gr106

class SuperStudent(name:String, marks:Map<String,Int>) : AStudent{
    override val name: String = name
    var mmarks = mapOf<String,Int>()

    init {
        mmarks = marks
    }
}

fun main() {
    val stds = mutableListOf<AStudent>()
    stds.add(SuperStudent("Jack", mapOf("chemistry" to 5,"Math" to 4)))}
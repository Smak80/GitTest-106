package ru.gr106

fun showStudents(sList: List<AStudent>){
    sList.forEach {
        println(it)
    }
}

fun main() {
    val stds = mutableListOf<AStudent>()
    stds.add(Student("Иванов И. И."))
    stds.add(Student("Петров П. П."))
    stds.add(Student("Галимуллин Р. Ш."))
    stds.add(Student("Сидоров С. В."))
    showStudents(stds)
}
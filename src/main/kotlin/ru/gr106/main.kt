package ru.gr106

fun showStudents(sList: List<AStudent>){
    sList.forEach {
        println(it)
    }
}

fun main() {
    val stds = mutableListOf<AStudent>()
    stds.add(Student("Иванов И. И."))
    stds.add(Student("Сидоров С. В."))
    showStudents(stds)
}
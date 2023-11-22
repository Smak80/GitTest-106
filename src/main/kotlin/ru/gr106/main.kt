package ru.gr106


fun main() {
    val stds = mutableListOf<AStudent>()
    stds.add(Student("Иванов И.И."))
    stds.add(Student("Иванова А.И."))
    showStudent(stds)

}
fun showStudent(sList: List<AStudent>){
    sList.forEach{
        println(it)
    }
}
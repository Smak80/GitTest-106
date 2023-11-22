package ru.gr106


fun main() {
    val stds = mutableListOf<AStudent>()

    showStudent(stds)

}
fun showStudent(sList: List<AStudent>){
    sList.forEach{
        println(it)
    }
}
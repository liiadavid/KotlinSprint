package lesson_8

fun main() {
    print("Введите количество ингредиентов и их наименование: ")
    val array = Array(readln().toInt()) { readln() }

    println("Ваш список: " + array.joinToString(", "))
}
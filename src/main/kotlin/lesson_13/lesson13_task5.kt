package lesson_13

fun main() {
    println("Введите номер: ")
    val number = try {
        readln().toLong()
    } catch (e: NumberFormatException) {
        println("Ошибка! В строке должны быть только цифры.")
    }
}

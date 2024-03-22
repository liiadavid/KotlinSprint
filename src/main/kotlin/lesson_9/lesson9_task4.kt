package lesson_9

fun main() {
    print("Введите 5 ингредиентов: ")
    val list: List<String> = readln().split(", ")

    println("Список в алфавитном порядке: " + list.sorted().joinToString(", "))
}
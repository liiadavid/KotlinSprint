package lesson_9

fun main() {
    val applePieList = listOf("яйцо", "мука", "сахар", "яблоко")
    print("В рецепте есть следующие ингредиенты: \n${applePieList.joinToString("\n")}")
}
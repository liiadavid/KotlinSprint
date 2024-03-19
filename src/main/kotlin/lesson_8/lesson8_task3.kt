package lesson_8

fun main() {
    val applePie = arrayOf("яйцо", "мука", "сахар", "яблоко")
    print("Какой ингредиент найти? - ")
    val ingredient = readln()

    if (ingredient in applePie) {
        println("Ингредиент $ingredient в рецепте есть")
        return
    }
    println("Такого ингредиента в рецепте нет")
}
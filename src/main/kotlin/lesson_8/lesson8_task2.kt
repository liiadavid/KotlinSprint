package lesson_8

fun main() {
    val applePie = arrayOf("яйцо", "мука", "сахар", "яблоко")
    print("Какой ингредиент найти? - ")
    val ingredient = readln()
    for (i in applePie) {
        if (i == ingredient) {
            println("Ингредиент $ingredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}
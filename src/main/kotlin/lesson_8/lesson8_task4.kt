package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("яйцо", "мука", "сахар", "яблоко")
    println(
        "Список ингредиентов: " +
                arrayOfIngredients.joinToString(", ") +
                "\nКакой ингредиент заменить? "
    )
    val ingredientToChange = readln()
    if (ingredientToChange !in arrayOfIngredients) {
        println("Такого ингредиента в рецепте нет")
    } else {
        println("Какой ингредиент добавить? ")
        val ingredientToAdd = readln()
        arrayOfIngredients[arrayOfIngredients.indexOf(ingredientToChange)] = ingredientToAdd
        println("Готово! Вы сохранили следующий список: " + arrayOfIngredients.joinToString(", "))
    }
}

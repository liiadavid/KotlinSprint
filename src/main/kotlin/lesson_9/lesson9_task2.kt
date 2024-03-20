package lesson_9

fun main() {
    val list = mutableListOf("яйцо", "мука", "сахар")
    println(
        "В рецепте есть базовые ингредиенты: " +
                "\n${list.joinToString("\n")}\n\n" +
                "Желаете добавить еще? ( да / нет )"
    )
    val answer = readln()

    if (answer == "да") {
        println("\nКакой ингредиент вы хотите добавить?")
        list.add(readln())
        println(
            "\nТеперь в рецепте есть следующие ингредиенты:" +
                    "\n${list.joinToString("\n")}"
        )
    }
}
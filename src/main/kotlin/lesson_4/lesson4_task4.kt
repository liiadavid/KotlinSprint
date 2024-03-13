package lesson_4

fun main() {
    val numberOfDay = 5

    println(
        "Упражнения для рук: ${(numberOfDay % 2 == 1)}\n" +
                "Упражнения для ног: ${(numberOfDay % 2 == 0)}\n" +
                "Упражнения для спины: ${(numberOfDay % 2 == 0)}\n" +
                "Упражнения для пресса: ${(numberOfDay % 2 == 1)}"
    )
}
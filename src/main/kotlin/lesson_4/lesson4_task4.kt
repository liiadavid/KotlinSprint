package lesson_4

fun main() {
    val numberOfDay = 5
    val isEven: Boolean = numberOfDay % 2 == 0

    println(
        "Упражнения для рук: ${!isEven}\n" +
                "Упражнения для ног: $isEven\n" +
                "Упражнения для спины: $isEven\n" +
                "Упражнения для пресса: ${!isEven}"
    )
}
package lesson_6

import kotlin.random.Random

fun main() {
    println("Докажите, что Вы не бот.")
    var attemptNumber = 3

    while (attemptNumber > 0) {
        attemptNumber--
        val firstNumber = Random.nextInt(1, 9)
        val secondNumber = Random.nextInt(1, 9)
        print(
            "Решите пример: $firstNumber + $secondNumber = "
        )
        val answer = readln().toInt()

        if (firstNumber + secondNumber != answer) {
            println("Неверно!")
        } else {
            println("Добро пожаловать!")
            return
        }
    }
    println("Доступ запрещен.")
}
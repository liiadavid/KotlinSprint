package lesson_5

import kotlin.random.Random

fun main() {
    val winNumbers = List(3) { Random.nextInt(0, 42) }

    print("Введите первое число от 0 до 42: ")
    val firstNumber = readln().toInt()
    print("Введите второе число от 0 до 42: ")
    val secondNumber = readln().toInt()
    print("Введите третье число от 0 до 42: ")
    val thirdNumber = readln().toInt()

    val printNumbers = setOf(firstNumber, secondNumber, thirdNumber)

    val lotteryResult = printNumbers.intersect(winNumbers.toSet())
    when (lotteryResult.size) {
        3 -> println("Джекпот! Вы угадали все 3 числа.")
        2 -> println("Крупный приз! Вы угадали 2 числа.")
        1 -> println("Утешительный приз! Вы угадали 1 число.")
        else -> println("Вы не угадали ни одного числа.")
    }

    println("Выигрышные значения: $winNumbers.")
}
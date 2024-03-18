package lesson_6

import kotlin.random.Random

fun main() {
    val hiddenNumber = Random.nextInt(1, 9)
    print("Давайте поиграем! Введите число от 1 до 9: ")
    var number = readln().toInt()

    var attemptNumber = 5
    while (attemptNumber > 0) {
        attemptNumber--
        if (number !== hiddenNumber && attemptNumber == 0) {
            println("Было загадано число $hiddenNumber.")
        } else if (number !== hiddenNumber) {
            print("Неверно! Попробуйте еще раз. Осталось попыток - $attemptNumber.\n" +
                    "Введите число: ")
            number = readln().toInt()
        } else {
            println("Это была великолепная игра!")
            break
        }
    }
}
package lesson_7

import kotlin.random.Random

fun main() {
    do {
        val password = Random.nextInt(1000, 9999)
        print(
            "Ваш код авторизации: $password.\n" +
                    "Введите код, чтобы авторизоваться: "
        )
        val enterPassword = readln().toInt()
    } while (password != enterPassword)
    println("Добро пожаловать!")
}
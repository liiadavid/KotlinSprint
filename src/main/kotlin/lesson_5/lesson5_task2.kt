package lesson_5

import java.time.LocalDateTime

fun main() {
    print("Введите год рождения: ")
    val yearOfBirth = readln().toInt()

    val resultText =
        if ((LocalDateTime.now().year - yearOfBirth) >= AGE_OF_MAJORITY)
            "Показать экран со скрытым контентом."
        else
            "Запрещено."

    println(resultText)
}

const val AGE_OF_MAJORITY = 18
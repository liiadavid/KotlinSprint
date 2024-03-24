package lesson_10

import kotlin.random.Random

fun main() {
    var man: Int
    var computer: Int
    var wonGames = 0

    do {
        man = rollTheDice()
        println("Ход человека.\nВыпавшее значение - $man\n")

        computer = rollTheDice()
        println("Ход компьютера.\nВыпавшее значение - $computer\n")

        println(getTheWin(man, computer))

        wonGames += countWins(man, computer)
        println()
    } while (continueTheGame())

    println()
    println("Конец игры. Выигранных партий: $wonGames.")
}

fun rollTheDice(): Int = Random.nextInt(1, 7)

fun continueTheGame(): Boolean {
    println("Хотите бросить кости еще раз? Введите Да или Нет")
    return readln().equals("да", true)
}

fun getTheWin(man: Int, computer: Int): String {
    return when {
        man > computer -> "Победило человечество."
        man == computer -> "Победила дружба."
        else -> "Победила машина."
    }
}

fun countWins(man: Int, computer: Int): Int {
    return if (man > computer) 1
    else 0
}
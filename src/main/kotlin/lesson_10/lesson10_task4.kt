package lesson_10

import kotlin.random.Random

fun main() {
    var man = 0
    var computer = 0
    var wonGames = 0

    do {
        man = rollADie(man)
        println("Ход человека.\nВыпавшее значение - $man\n")

        computer = rollADie(computer)
        println("Ход компьютера.\nВыпавшее значение - $computer\n")

        getTheWin(man, computer)

        wonGames += countWins(man, computer)
        println()
    } while (continueTheGame())

    println()
    println("Конец игры. Выигранных партий: $wonGames.")
}

fun continueTheGame(): Boolean {
    println("Хотите бросить кости еще раз? Введите Да или Нет")
    val answer = readln()
    println()

    return answer.equals("да", true)
}

fun rollADie(player: Int): Int {
    val number = Random.nextInt(1, 7)
    val player = number

    return player
}

fun getTheWin(man: Int, computer: Int) {
    when {
        man > computer -> println("Победило человечество.")
        man < computer -> println("Победила машина.")
        man == computer -> println("Победила дружба.")
    }
}

fun countWins(man: Int, computer: Int): Int {
    var wins = 0
    if (man > computer) wins += 1

    return wins
}
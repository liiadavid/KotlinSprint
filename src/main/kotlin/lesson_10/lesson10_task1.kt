package lesson_10

import kotlin.random.Random

fun main() {
    val player = rollADie()
    println("Ход человека.\nВыпавшее значение -  $player\n")

    val computer = rollADie()
    println("Ход компьютера.\nВыпавшее значение - $computer\n")

    when {
        player < computer -> println("Победила машина.")
        player > computer -> println("Победило человечество.")
        player == computer -> println("Победила дружба.")
    }
}

fun rollADie(): Int = Random.nextInt(1, 7)
package lesson_10

import kotlin.random.Random

fun main() {
    var player = 0
    var computer = 0

    player += rollADie()
    println("Ход человека.\nВыпавшее значение -  $player\n")

    computer += rollADie()
    println("Ход компьютера.\nВыпавшее значение - $computer\n")

    if (computer > player)
        println("Победила машина.")
    else if (computer < player)
        println("Победило человечество.")
    else
        println("Победила дружба.")
}

fun rollADie(): Int = Random.nextInt(1, 7)
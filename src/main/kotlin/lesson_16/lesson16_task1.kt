package lesson_16

import kotlin.random.Random

fun main() {
    val dice = Dice()
    dice.showNumber()
}

class Dice(
    private val number: Int = Random.nextInt(1, 7)
) {
    fun showNumber() {
        println(number)
    }
}
package lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70000
    val rate = 16.7
    val years = 20
    val finalDeposit = deposit*((1 + (rate / 100)).pow(years))

    println("Размер вклада через $years лет = " + String.format("%.3f", finalDeposit) )
}
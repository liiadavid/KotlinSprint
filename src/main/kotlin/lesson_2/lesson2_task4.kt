package lesson_2

fun main() {
    val crystallineOre = 7
    val ironOre = 11
    val percent = 20
    val hundredPercent = 100

    println("Количество бонусной кристаллической руды = " + (((crystallineOre.toDouble() / hundredPercent) * percent).toInt()))
    println("Количество бонусной железной руды = " + ((ironOre.toDouble() / hundredPercent) * percent).toInt())
}
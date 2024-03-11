package lesson_2

fun main() {
    val crystallineOre = 7
    val ironOre = 11
    val percent = 20

    println("Количество бонусной кристаллической руды = " + (((crystallineOre.toDouble() / 100) * percent).toInt()))
    println("Количество бонусной железной руды = " + ((ironOre.toDouble() / 100) * percent).toInt())
}
package lesson_2

fun main() {
    val crystallineOre = 7
    val ironOre = 11
    val crystallineOreWithBuff = crystallineOre + crystallineOre * 0.2
    val ironOreWithBuff = ironOre + ironOre * 0.2

    println("Количество бонусной кристаллической руды = " + ((crystallineOreWithBuff - crystallineOre).toInt()))
    println("Количество бонусной железной руды = " + ((ironOreWithBuff - ironOre).toInt()))
}
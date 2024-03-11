package lesson_3

fun main() {
    val move = "D2-D4;0"

    val moveSplit = move.split("-",";").toTypedArray()
    val from = moveSplit[0]
    val where = moveSplit[1]
    val moveNumber = moveSplit[2]
    println("Откуда - $from")
    println("Куда - $where")
    println("Ход - $moveNumber")
}
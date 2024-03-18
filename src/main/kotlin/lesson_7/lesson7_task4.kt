package lesson_7

fun main() {
    print("Сколько секунд засечь? - ")
    val time = readln().toInt()

    for (i in time downTo 1) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
    }
    println("Время вышло.")
}
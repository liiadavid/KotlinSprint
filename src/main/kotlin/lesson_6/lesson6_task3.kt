package lesson_6

fun main() {
    print("Сколько секунд засечь? - ")
    val time = readln().toInt()
    var timer = time
    while (timer > 0) {
        println("Осталось секунд: $timer")
        --timer
        Thread.sleep(1000)
    }
    println("Время вышло.")
}
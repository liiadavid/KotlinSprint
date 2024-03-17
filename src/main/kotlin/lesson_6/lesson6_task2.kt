package lesson_6

fun main() {
    print("Сколько секунд засечь? - ")
    val time = readln().toInt()
    var timer = time
    while (timer > 0) {
        timer--
        Thread.sleep(1000)
    }
    println("Прошло $time секунд.")
}
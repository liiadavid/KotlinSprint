package lesson_6

fun main() {
    print("Сколько секунд засечь? - ")
    val time = readln().toLong()
    Thread.sleep(time * 1000)

    println("Прошло $time секунд.")
}
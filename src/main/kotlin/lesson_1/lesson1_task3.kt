package lesson_1

fun main() {
    val year = 1961
    var hour = 9
    var minute = 7

    println(year)
    // println(hour.toString().padStart(2, '0'))
    // println(minute.toString().padStart(2, '0'))
    println("0$hour")
    println("0$minute")

    hour = 10
    minute = 55
    print("$hour:$minute")
}
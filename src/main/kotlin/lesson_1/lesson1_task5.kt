package lesson_1

fun main() {
    val seconds = 6480

    val hour = (seconds / 3600) % 24
    val minute = (seconds / 60) % 60
    val second = seconds % 60
    val timeInSpace = "0$hour:$minute:0$second"
    println(timeInSpace)
}
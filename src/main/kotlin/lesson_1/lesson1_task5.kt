package lesson_1

fun main() {
    val seconds = 6480

    val hour = (seconds / 3600) % 24
    val minute = (seconds / 60) % 60
    val second = seconds % 60
    val timeInSpace = String.format("%02d:%02d:%02d", hour, minute, second)

    println("Время, проведенное в космосе - $timeInSpace")
}
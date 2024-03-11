package lesson_1

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60
const val MINUTES_IN_HOUR = 60
const val HOURS_IN_DAY = 24

fun main() {
    val seconds = 6480

    val hour = (seconds / SECONDS_IN_HOUR) % HOURS_IN_DAY
    val minute = (seconds / SECONDS_IN_MINUTE) % MINUTES_IN_HOUR
    val second = seconds % SECONDS_IN_MINUTE
    val timeInSpace = String.format("%02d:%02d:%02d", hour, minute, second)

    println("Время, проведенное в космосе - $timeInSpace")
}
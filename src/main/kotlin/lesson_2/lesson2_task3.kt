package lesson_2

fun main() {
    val departureHour: Int = 9
    val departureMinute: Int = 39
    val travelTime: Int = 457
    val travelTimeHours: Int = travelTime / 60
    val travelTimeMinutes: Int = travelTime % 60
    val arriveMinute = (departureMinute + travelTimeMinutes) % 60
    val arriveHour = departureHour + travelTimeHours + ((departureMinute + travelTimeMinutes) / 60)
    println("Поезд прибудет в $arriveHour:$arriveMinute.")
}
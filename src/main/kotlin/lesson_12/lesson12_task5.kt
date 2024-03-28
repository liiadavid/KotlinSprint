package lesson_12

import kotlin.random.Random

fun main() {
    val daysInMonth = 30

    val tempList: MutableList<WeatherForDay2> = mutableListOf()

    for (i in 1..daysInMonth) {
        tempList.add(
            WeatherForDay2(
                Random.nextInt(0, 30),
                Random.nextInt(0, 30),
                Random.nextBoolean()
            )
        )
    }

    val dayTempsList = tempList.map { it.dayTemp }
    val nightTempsList = tempList.map { it.nightTemp }
    val rainfallList = tempList.map { it.isRainfall.toString() }

    val averageDayTemp = dayTempsList.average().toInt()
    val averageNightTemp = nightTempsList.average().toInt()
    var rainyDays = 0
    rainfallList.forEach { it ->
        if (it.equals("true")) rainyDays += 1
    }

    println("Средняя температура днем: $averageDayTemp\n" +
            "Средняя температура ночью: $averageNightTemp\n" +
            "Количество дней с осадками: $rainyDays")
}

class WeatherForDay2(
    var dayTemp: Int,
    var nightTemp: Int,
    var isRainfall: Boolean = false,
)

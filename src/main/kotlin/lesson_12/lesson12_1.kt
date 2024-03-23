package lesson_12

fun main() {
    val monday = OneDayWeather()
    monday.dayTemp = 18
    monday.nightTemp = 12
    monday.isRainfall = true

    val tuesday = OneDayWeather()
    tuesday.dayTemp = 22
    tuesday.nightTemp = 17
    tuesday.isRainfall = false

    monday.showWeather()
    tuesday.showWeather()
}

class OneDayWeather {
    var dayTemp: Int = 20
    var nightTemp: Int = 15
    var isRainfall: Boolean = false

    fun showWeather() {
        println(
            "Температура днем: $dayTemp,\n" +
                    "Температура ночью: $nightTemp,\n" +
                    "Вероятность осадков: $isRainfall.\n"
        )
    }
}
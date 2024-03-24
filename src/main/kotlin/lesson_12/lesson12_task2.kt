package lesson_12

fun main() {
    val monday = WeatherForOneDay(20, 15, true)

    monday.showWeather()
}

class WeatherForOneDay(
    _dayTemp: Int,
    _nightTemp: Int,
    _isRainfall: Boolean,
) {
    var dayTemp = _dayTemp
    var nightTemp = _nightTemp
    var isRainfall = _isRainfall

    fun showWeather() {
        println(
            "Температура днем: $dayTemp,\n" +
                    "Температура ночью: $nightTemp,\n" +
                    "Вероятность осадков: $isRainfall.\n"
        )
    }
}
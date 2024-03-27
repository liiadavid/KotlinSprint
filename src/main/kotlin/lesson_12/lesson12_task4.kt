package lesson_12

fun main() {
    val day = WeatherDay(20, 15, false)
}

class WeatherDay(
    dayTemp: Int,
    nightTemp: Int,
    isRainfall: Boolean,
) {
    init {
        println(
            "Температура днем: ${dayTemp},\n" +
                    "Температура ночью: $nightTemp,\n" +
                    "Вероятность осадков: $isRainfall.\n"
        )
    }
}

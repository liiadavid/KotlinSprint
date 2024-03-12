package lesson_4

fun main() {
    val sunForLegumes = true
    val openSunshadeForLegumes = true
    val airHumidityForLegumes = 20
    val noSeasonForLegumes = "Winter"

    val isSunny = true
    val isSunshadeOpen = true
    val airHumidity = 20
    val season = "Winter"

    println("Благоприятные ли условия сейчас для роста бобовых? - ${(isSunny == sunForLegumes) && (isSunshadeOpen == openSunshadeForLegumes) && (airHumidity == airHumidityForLegumes) && (season !== noSeasonForLegumes)}")
}
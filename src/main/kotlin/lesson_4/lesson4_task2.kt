package lesson_4

fun main() {
    val averageMinWeight = 35
    val averageMaxWeight = 100
    val averageMaxVolume = 100
    var cargoWeight = 20
    var cargoVolume = 80

    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': ${(averageMinWeight < cargoWeight) && (cargoWeight <= averageMaxWeight) && (cargoVolume < averageMaxVolume)}")

    cargoWeight = 50
    cargoVolume = 100

    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': ${(averageMinWeight < cargoWeight) && (cargoWeight <= averageMaxWeight) && (cargoVolume < averageMaxVolume)}.")
}
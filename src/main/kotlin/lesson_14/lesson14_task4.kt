package lesson_14

fun main() {
    val redPlanet = Planet(
        atmosphere = true,
        landing = true,
        name = "Марс",
        listOf(
            Satellite(
                atmosphere = false,
                landing = true,
                name = "Фобос"
            ),
            Satellite(
                atmosphere = false,
                landing = true,
                name = "Деймос"
            )
        )
    )

    println(redPlanet.name)
    redPlanet.satelliteList.forEach { satellite ->
        println(satellite.name)
    }
}

open class CelestialBody(
    val atmosphere: Boolean,
    val landing: Boolean,
    val name: String,
)

class Planet(
    atmosphere: Boolean,
    landing: Boolean,
    name: String,
    val satelliteList: List<Satellite>,
) : CelestialBody(atmosphere, landing, name)

class Satellite(
    atmosphere: Boolean,
    landing: Boolean,
    name: String,
) : CelestialBody(atmosphere, landing, name)
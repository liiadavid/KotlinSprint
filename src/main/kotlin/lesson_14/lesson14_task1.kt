package lesson_14

fun main() {
    val liner1 = LinerShip("Liner")
    val cargo1 = CargoShip("Cargo")
    val breaker1 = Icebreaker("Ice Break")
}

open class LinerShip(
    val name: String,
    val speed: Int = 80,
    val liftingCapacity: Int = 50,
    val passengerCapacity: Int = 100,
    val iceBreak: Boolean = false,
)

class CargoShip(
    name: String,
) : LinerShip(
    name,
    speed = 50,
    liftingCapacity = 100,
    passengerCapacity = 100
)

class Icebreaker(
    name: String,
) : LinerShip(
    name,
    speed = 20,
    liftingCapacity = 50,
    passengerCapacity = 20,
    iceBreak = true
)

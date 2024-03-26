package lesson_14

fun main() {
    val liner = SomeLinerShip("Liner")
    val cargo = SomeCargoShip("Cargo")
    val breaker = SomeIcebreaker("Ice Break")

    liner.loadingMethod()
    cargo.loadingMethod()
    breaker.loadingMethod()

    liner.showShipInfo()
    cargo.showShipInfo()
    breaker.showShipInfo()
}

open class SomeLinerShip(
    val name: String,
    val speed: Int = 80,
    val liftingCapacity: Int = 50,
    val passengerCapacity: Int = 100,
    val iceBreak: Boolean = false,
) {
    fun showShipInfo() {
        println(
            "Свойства корабля:\n" +
                    "название = $name,\n" +
                    "скорость = $speed,\n" +
                    "грузоподъемность = $liftingCapacity,\n" +
                    "вместимость = $passengerCapacity,\n" +
                    "ледокол = $iceBreak."
        )
        println()
    }

    open fun loadingMethod() {
        println("Выдвинуть горизонтальный трап со шкафута")
    }
}

class SomeCargoShip(
    name: String,
) : SomeLinerShip(
    name,
    speed = 50,
    liftingCapacity = 100,
    passengerCapacity = 100
) {
    override fun loadingMethod() {
        println("Активировать погрузочный кран")
    }
}

class SomeIcebreaker(
    name: String,
) : SomeLinerShip(
    name,
    speed = 20,
    liftingCapacity = 50,
    passengerCapacity = 20,
    iceBreak = true
) {
    override fun loadingMethod() {
        println("Открыть ворота со стороны кормы")
    }
}
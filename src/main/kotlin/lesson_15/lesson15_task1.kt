package lesson_15

fun main() {
    val crucianCarp = CrucianCarp()
    val gull = Seagull()
    val duck = Duck()

    crucianCarp.swim()
    println()
    gull.fly()
    gull.swim()
    println()
    duck.swim()
    duck.fly()
}

interface FlyingCreature {
    fun fly()
}

interface FloatingCreature {
    fun swim()
}

class CrucianCarp : FloatingCreature {
    override fun swim() {
        println("Создание плавает")
    }
}

class Seagull : FlyingCreature, FloatingCreature {
    override fun fly() {
        println("Создание летает")
    }

    override fun swim() {
        println("Создание плавает")
    }
}

class Duck : FlyingCreature, FloatingCreature {
    override fun fly() {
        println("Создание летает")
    }

    override fun swim() {
        println("Создание плавает")
    }
}
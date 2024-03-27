package lesson_14

import kotlin.math.pow

fun main() {
    val figureList = mutableListOf(
        Circle("white", 5),
        Circle("black", 3),
        Rectangle("white", 2, 4),
        Rectangle("black", 3, 5)
    )

    var sumBlack = 0.00
    var sumWhite = 0.00

    figureList.forEach { figure ->
        if (figure.color.equals("white", ignoreCase = true)) {
            sumWhite += figure.calculateArea()
        } else sumBlack += figure.calculatePerimeter()
    }

    println("Сумма площадей всех белых фигур: $sumWhite")
    println("Сумма периметров всех черных фигур: $sumBlack")
}

abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {
    override fun calculateArea() = PI * radius.toDouble().pow(POWER.toDouble())

    override fun calculatePerimeter() = 2 * PI * radius
}

class Rectangle(
    color: String,
    val width: Int,
    val heigth: Int,

    ) : Figure(color) {
    override fun calculateArea() = (width * heigth).toDouble()

    override fun calculatePerimeter() = (2 * (width + heigth)).toDouble()
}

const val PI = 3.14
const val POWER = 2
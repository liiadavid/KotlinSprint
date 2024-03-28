package lesson_14

import kotlin.math.pow

fun main() {
    val figureList = mutableListOf(
        Circle(color = WHITE_COLOR, radius = 5),
        Circle(color = BLACK_COLOR, radius = 3),
        Rectangle(color = WHITE_COLOR, width = 2, heigth = 4),
        Rectangle(color = BLACK_COLOR, width = 3, heigth = 5)
    )
    val blackFigureList = figureList.filter { it.color == BLACK_COLOR }
    val whiteFigureList = figureList.filter { it.color == WHITE_COLOR }
    var sumBlack = 0.00
    var sumWhite = 0.00

    blackFigureList.forEach { figure ->
        sumBlack += figure.calculatePerimeter()
    }
    whiteFigureList.forEach { figure ->
        sumWhite += figure.calculateArea()
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
const val WHITE_COLOR = "white"
const val BLACK_COLOR = "black"
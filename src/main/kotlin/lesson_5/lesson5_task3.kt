package lesson_5

fun main() {
    val winFirstNumber = 1
    val winSecondNumber = 2
    print("Введите первое число от 0 до 42: ")
    val firstNumber = readln().toInt()
    print("Введите второе число от 0 до 42: ")
    val secondNumber = readln().toInt()

    val resultText =
        if ((firstNumber == winFirstNumber || firstNumber == winSecondNumber) &&
            (secondNumber == winFirstNumber || secondNumber == winSecondNumber)
        ) {
            "Поздравляем! Вы выиграли главный приз!"
        } else if ((firstNumber == winFirstNumber || firstNumber == winSecondNumber) ||
            (secondNumber == winFirstNumber || secondNumber == winSecondNumber)
        ) {
            "Вы выиграли утешительный приз!"
        } else {
            "Неудача!"
        }

    println(resultText)
    println("Выигрышные значения: $winFirstNumber и $winSecondNumber.")
}
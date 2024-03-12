package lesson_5

fun main() {
    val firstNumber = 1
    val secondNumber = 2
    val sum = firstNumber + secondNumber
    val welcome = "Добро пожаловать!"
    val denied = "Доступ запрещен."

    print("Сколько будет $firstNumber + $secondNumber? = ")
    val sumPrint: Int = readln().toInt()
    println(
        if (sumPrint == sum) {
            welcome
        } else {
            denied
        }
    )
}
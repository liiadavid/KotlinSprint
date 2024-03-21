package lesson_7

fun main() {
    val symbols = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    val upperCase = 'A'..'Z'
    val lowerCase = 'a'..'z'
    val numbers = '0'..'9'

    var password = ""

    print("Задайте длину пароля (более 6 символов): ")
    val length = readln().toInt()

    password += (upperCase.random())
    password += (lowerCase.random())
    password += (numbers.random())

    for (i in 3 until length) {
        password += symbols.random()
    }

    println(password.toMutableList().shuffled().joinToString(""))
}

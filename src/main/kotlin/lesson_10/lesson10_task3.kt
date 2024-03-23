package lesson_10

fun main() {
    println("Длина пароля?")
    val length = readln().toInt()
    println(
        "Ваш пароль:\n" +
                getPassword(length)
    )
}

fun getPassword(length: Int): String {
    val symbols = 0x20..0x2F
    val numbers = '0'..'9'
    var password = ""

    for (i in 1..(length / 2) + 1) {
        password += numbers.random()
        password += symbols.random().toChar()
    }

    password = password.substring(0, length)
    return (password)
}
package lesson_7

import java.security.SecureRandom

fun main() {
    val symbols = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    var password = ""
    print("Задайте длину пароля (более 6 символов): ")
    val length = readln().toInt()
    val secureRandom = SecureRandom()

    for (i in 1..length) {
        password += symbols[secureRandom.nextInt(symbols.size)]
    }

    println(password)
}

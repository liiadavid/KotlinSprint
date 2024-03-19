package lesson_7

import java.lang.StringBuilder

fun main() {
    val symbols = 'a'..'z'
    val numbers = '0'..'9'
    val length = 6
    val password = StringBuilder()

    for (i in 1..(length / 2)) {
        password.append(symbols.random())
        password.append(numbers.random())
    }
    println(password)
}
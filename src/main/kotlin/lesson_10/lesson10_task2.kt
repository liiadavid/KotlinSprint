package lesson_10

fun main() {
    println("Введите логин: ")
    val login = readln()
    println("Введите пароль: ")
    val password = readln()

    if (checkLength(login) && checkLength(password))
        println("Добро пожаловать!")
    else println("Логин или пароль недостаточно длинные.")
}

fun checkLength(string: String): Boolean {
    val minLength = 4
    return string.length > minLength
}
package lesson_10

fun main() {
    println("Введите логин: ")
    val login = readln()
    println("Введите пароль: ")
    val password = readln()

    checkLength(login, password)
}

fun checkLength(a: String, b: String) {
    if (a.length < 4 || b.length < 4)
        println("Логин или пароль недостаточно длинные.")
    else println("Добро пожаловать!")
}
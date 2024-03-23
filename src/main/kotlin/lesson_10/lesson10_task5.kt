package lesson_10

fun main() {
    println("Авторизация. Введите логин: ")
    val login = readln()
    println("Введите пароль: ")
    val password = readln()
    println()

    println("Ваш токен: ")
    val token: String? = getToken(login, password)
    println(token)
    println()

    println(getBasket(token))
}

fun getToken(login: String, password: String): String? {
    val tokenLength = 32
    val symbols = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    val userLogin = "Maria"
    val userPassword = "maria123"

    var token = ""

    for (i in 0..tokenLength) {
        token += symbols.random()
    }

    return if (userLogin == login && userPassword == password)
        token
    else {
        null
    }
}

fun getBasket(token: String?): String {
    val userBasket = listOf("молоко", "мёд", "сахар")

    return if (token != null) "Содержимое Вашей корзины: " + userBasket.joinToString(", ")
    else "Неудачная авторизация."
}
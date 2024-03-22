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
    val symbols = "!\"#$%&'()*+,-./ "
    val numbers = '0'..'9'
    var password1 = ""

    for (i in 1..(length / 2) + 1) {
        password1 += numbers.random()
        password1 += symbols.random()

        if (password1.length > length)
            password1 = password1.substring(0, length)
        continue
    }

    return (password1)
}
package lesson_5

fun main() {
    val login = "Zaphod"
    val password = "PanGalactic"

    print("Введите логин: ")
    val loginPrint = readln()
    val resultText =
        if (loginPrint == login) {
            print("Введите пароль: ")
            val passwordPrint = readln()
            if (passwordPrint == password) {
                "Добро пожаловать!"
            } else {
                "Пароль неверный."
            }
        } else {
            "Пользователь не зарегистрирован. Начать регистрацию?"
        }

    println(resultText)
}
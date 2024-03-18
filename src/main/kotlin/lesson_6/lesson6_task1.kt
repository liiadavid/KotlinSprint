package lesson_6

fun main() {
    var loginAuthorization: String
    var passwordAuthorization: String
    print("Регистрация нового пользователя.\n" +
            "Введите логин: ")
    val loginRegistration = readln()
    print("Введите пароль: ")
    val passwordRegistration = readln()

    println("Авторизация.")
    do { print("Введите логин: ")
        loginAuthorization = readln()
        print("Введите пароль: ")
        passwordAuthorization = readln()
    } while (loginAuthorization != loginRegistration ||
        passwordAuthorization != passwordRegistration)

    println("Авторизация прошла успешно.")
}

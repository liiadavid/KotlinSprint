package lesson_11

fun main() {
    val user = User2(1, "Maria", "maria123", "maria@mail.com")

    println("Напишите пару слов о себе: ")
    user.addBio()

    println()
    user.changePassword()

    println()
    user.printAboutUser()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String? = null,
) {
    fun printAboutUser() {
        println(
            "Информация о пользователе:\n" +
                    "id: $id\n" +
                    "Логин: $login\n" +
                    "Пароль: $password\n" +
                    "Почта: $mail\n" +
                    "О себе: $bio"
        )
    }

    fun addBio() {
        bio = readln()
    }

    fun changePassword() {
        println("Ведите пароль: ")
        val printPassword = readln()
        if (printPassword == password) {
            println("Введите новый пароль: ")
            password = readln()
            println("Пароль изменен.")
        } else {
            println("Пароль неверный.")
        }
    }
}
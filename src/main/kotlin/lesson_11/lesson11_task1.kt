package lesson_11

fun main() {
    val user1: User = User(
        id = 1,
        login = "Anna",
        password = "anna123",
        mail = "anna@mail.com"
    )

    val user2: User = User(
        id = 2,
        login = "Maria",
        password = "maria123",
        mail = "maria@mail.com"
    )

    println(
        "${user1.id}, " +
                "${user1.login}, " +
                "${user1.password}, " +
                user1.mail
    )
    println(
        "${user2.id}, " +
                "${user2.login}, " +
                "${user2.password}, " +
                user2.mail
    )
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)
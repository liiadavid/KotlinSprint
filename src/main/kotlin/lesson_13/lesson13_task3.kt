package lesson_13

fun main() {
    val contactList: MutableList<Contact1> = mutableListOf(
        Contact1(
            name = "Алексей",
            phoneNumber = (89998889988),
            company = "Трейд"
        ),
        Contact1(
            name = "Мария",
            phoneNumber = (89998887766),
            company = "Мария Груп"
        ),
        Contact1(
            name = "Анна",
            phoneNumber = (89998885544),
            company = null
        ),
        Contact1(
            name = "Виктория",
            phoneNumber = (89998883322),
            company = "null"
        ),
        Contact1(
            name = "Сергей",
            phoneNumber = (89998881100),
            company = null
        )
    )

    println("Все компании: " +
            contactList.mapNotNull { it.company }
                .joinToString(", "))
}

class Contact1(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)
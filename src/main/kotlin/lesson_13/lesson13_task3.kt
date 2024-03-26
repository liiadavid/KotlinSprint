package lesson_13

import lesson_13.Contact1.Companion.showAllCompanies

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

    showAllCompanies(contactList)
}

class Contact1(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    companion object {
        fun showAllCompanies(list: MutableList<Contact1>) {
            println("Все компании: ")
            list.forEachIndexed { index, contact1 ->
                println(contact1.company ?: "<не указано>")
            }
        }
    }
}
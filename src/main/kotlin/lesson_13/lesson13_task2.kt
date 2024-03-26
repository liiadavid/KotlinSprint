package lesson_13

fun main() {
    val maria = Contact(
        name = "Мария",
        phoneNumber = 81234567890,
    )
    maria.showInfo()
}

class Contact(
    val name: String,
    var phoneNumber: Long,
    var company: String? = null,
) {
    fun showInfo() {
        println(
            "Имя: $name\n" +
                    "Номер: $phoneNumber\n" +
                    "Компания: ${company ?: "<не указано>"}"
        )
    }
}
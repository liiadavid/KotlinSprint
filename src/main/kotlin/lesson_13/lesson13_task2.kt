package lesson_13

fun main() {
    val maria = Contact(
        name = "Мария",
        phoneNumber = 81234567890,
    )
    maria.showInfo()
}

class Contact(
    var name: String,
    var phoneNumber: Long,
    var company: String? = null ?: "<не указано>",
) {
    fun showInfo() {
        println(
            "Имя: $name\n" +
                    "Номер: $phoneNumber\n" +
                    "Компания: $company"
        )
    }
}
package lesson_13

fun main() {
    val maria = PhoneContact(
        name = "Maria",
        phoneNumber = 81234567890,
        company = null,
    )
}

class PhoneContact(
    var name: String,
    var phoneNumber: Long,
    var company: String?,
)
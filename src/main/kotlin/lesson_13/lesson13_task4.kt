package lesson_13

fun main() {
    val contactBook: MutableList<SomeContact> = mutableListOf()

    val new = SomeContact(
        name = readln(),
        phoneNumber = readln().toLongOrNull(),
        company = readln()
    )

    if (new.company?.isEmpty() == true) new.company = null

    if (new.phoneNumber != null) contactBook.add(
        SomeContact(
            name = new.name,
            phoneNumber = new.phoneNumber,
            company = new.company
        )
    ) else println("Номер не введен")


    contactBook.forEach { SomeContact ->
        SomeContact.showInfo()
    }
}

class SomeContact(
    var name: String,
    var phoneNumber: Long?,
    var company: String?,
) {
    fun showInfo() {
        println(
            "Имя: $name\n" +
                    "Номер: $phoneNumber\n" +
                    "Компания: $company"
        )
    }
}
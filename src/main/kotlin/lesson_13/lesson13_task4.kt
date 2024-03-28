package lesson_13

fun main() {
    val contactBook: MutableList<SomeContact> = mutableListOf()

    val new = SomeContact(
        name = readln(),
        phoneNumber = readln().toLongOrNull(),
        company = readln()
    ).addNewContact(contactBook)

    contactBook.forEach { SomeContact ->
        SomeContact.showInfo()
    }
}

class SomeContact(
    var name: String,
    var phoneNumber: Long?,
    var company: String?,
) {
    fun addNewContact(list: MutableList<SomeContact>) {
        if (company!!.isEmpty()) company = null

        if (phoneNumber != null) list.add(
            SomeContact(name = name, phoneNumber = phoneNumber, company = company)
        ) else println("Номер не введен")
    }

    fun showInfo() {
        println(
            "Имя: $name\n" +
                    "Номер: $phoneNumber\n" +
                    "Компания: $company"
        )
    }
}
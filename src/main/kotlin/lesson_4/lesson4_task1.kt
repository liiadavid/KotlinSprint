package lesson_4

fun main() {
    val todayReservedTables = 13
    val tomorrowReservedTables = 9

    println(
        "[Доступность столиков на сегодня: ${todayReservedTables < NUMBER_OF_TABLES}],\n" +
                "[Доступность столиков на завтра: ${tomorrowReservedTables < NUMBER_OF_TABLES}]."
    )
}

const val NUMBER_OF_TABLES = 13
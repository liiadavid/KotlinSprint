package lesson_4

fun main() {
    val numberOfTables = 13
    val todayReservedTables = 13
    val tomorrowReservedTables = 9

    println("[Доступность столиков на сегодня: ${todayReservedTables < numberOfTables}],\n[Доступность столиков на завтра: ${tomorrowReservedTables < numberOfTables}].")
}
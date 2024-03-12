package lesson_4

fun main() {
    print("Поврежден ли корпус? Введите true или false: ")
    val isDamagedPrint: Boolean = readln().toBoolean()
    print("Сколько человек в экипаже? Введите число: ")
    val crewPrint: Int = readln().toInt()
    print("Сколько ящиков с провизией? Введите число: ")
    val provisionBoxesPrint: Int = readln().toInt()
    print("Погода благоприятна? Введите true или false: ")
    val weatherPrint: Boolean = readln().toBoolean()

    println(
        "Может ли корабль отправиться в плавание: " +
                "${
                    ((IS_DAMAGED == isDamagedPrint) &&
                            (crewPrint in MIN_CREW..MAX_CREW) &&
                            (provisionBoxesPrint >= PROVISION_BOXES)) ||
                            ((crewPrint == MAX_CREW) &&
                                    (weatherPrint == WEATHER_IS_FUN) &&
                                    (provisionBoxesPrint >= PROVISION_BOXES))
                }"
    )
}

const val IS_DAMAGED = false
const val MIN_CREW = 55
const val MAX_CREW = 70
const val PROVISION_BOXES = 50
const val WEATHER_IS_FUN = true
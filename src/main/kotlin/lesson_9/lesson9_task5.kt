package lesson_9

import java.util.*

fun main() {
    println("Введите 5 ингредиентов: ")
    val list = MutableList(5) { readln() }

    println("Ваш список: " +
            (list
                .toSortedSet()
                .joinToString(", "))
                .replaceFirstChar {
                    if (it.isLowerCase())
                        it.titlecase(Locale.getDefault())
                    else it.toString()
                }
    )
}
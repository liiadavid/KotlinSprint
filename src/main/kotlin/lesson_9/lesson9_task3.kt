package lesson_9

fun main() {
    val portion = listOf(2, 50, 15)
    println("Введите количество порций: ")
    val numberOfPortions = readln().toInt()

    val morePortions = portion.map {
        it * numberOfPortions
    }

    println(
        "На $numberOfPortions порций вам понадобится:\n" +
                "Яиц - ${morePortions[0]} шт., " +
                "молока - ${morePortions[1]} мл., " +
                "сливочного масла - ${morePortions[2]} гр."
    )
}
package lesson_8

fun main() {
    print("Введите количество ингредиентов: ")
    val length = readln().toInt()
    val arr = Array<String?>(length) { "" }

    for (i in 0 until  length) {
        print("Введите ${i+1} ингредиент: ")
        arr[i] = readln()
    }
    println("Ваш список: " + arr.joinToString(", "))
}
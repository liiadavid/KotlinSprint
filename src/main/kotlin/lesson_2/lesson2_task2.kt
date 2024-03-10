package lesson_2

fun main() {
    val workers = 50
    val workersSalary = 30000
    val interns = 30
    val internsSalary = 20000
    val workersSalarySum: Int = workersSalary * workers
    val allSalarySum: Int = internsSalary * interns + workersSalarySum
    val averageSalary: Int = allSalarySum / (workers + interns)

    println("Расходы на выплату зарплаты постоянных сотрудников составляют $workersSalarySum")
    println("Общие расходы по зарплаты после прихода стажеров составляют $allSalarySum")
    println("Средняя зарплата одного сотрудника составляет $averageSalary")
}
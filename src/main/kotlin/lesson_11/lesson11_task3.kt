package lesson_11

fun main() {
    val member1 = Room.Member(
        nickname = "Мария",
        avatar = "mariaAvatar",
        status = "разговаривает"
    )

    val room1 = Room(
        name = "Кулинария",
        members = mutableListOf(),
        cover = "cover"
    )

    room1.addMember(member1)

    println()
    room1.addStatus(member1)

    println()
    room1.longClickAvatar(member1)
}

class Room(
    val name: String,
    var members: MutableList<Member>,
    val cover: String
) {
    data class Member(
        var nickname: String,
        val avatar: String,
        var status: String,
    )

    fun addStatus(member: Member) {
        println("Ввведите имя пользователя: ")
        member.nickname = readln()
        println("Выберите новый статус: ")
        member.status = readln()
    }

    fun longClickAvatar(member: Member) {
        println(
            "Информация о пользователе:\n" +
                    "Логин: ${member.nickname}\n" +
                    "Статус: ${member.status}"
        )
    }

    fun addMember(member: Member) {
        members.add(member)
    }
}
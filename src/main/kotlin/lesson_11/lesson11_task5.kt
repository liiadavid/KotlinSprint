package lesson_11

import lesson_11.Forum.Companion.printThread

fun main() {
    val member1: ForumMember = ForumMember.createNewUser(name = "Мария")
    println(member1.userId)
    println(member1.name)
    val message1: ForumMessage = ForumMessage.createNewMessage(1, 1)
    println(message1.message)

    val forum: Forum
    printThread(member1, message1)
}

class Forum {
    companion object {
        fun printThread(author: ForumMember, message: ForumMessage) {
            println("$author: $message")
        }
    }
}

class ForumMember(
    val userId: Int,
    val name: String,
) {
    companion object {
        fun createNewUser(name: String): ForumMember {
            val idGenerate = 0
            return ForumMember(userId = (idGenerate + 1), name = name)
        }
    }
}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {
    companion object {
        fun createNewMessage(authorId: Int, userId: Int): ForumMessage {
            return if (authorId == userId)
                ForumMessage(authorId = authorId, message = readln())
            else ForumMessage(1, "no")
        }
    }
}
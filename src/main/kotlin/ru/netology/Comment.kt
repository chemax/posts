package ru.netology

data class Comment(
    val id: Int,
    val postId: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val donut: Donut?,
    val replyToUser: Int?,
    val replyToComment: Int?,
    val attachments: List<Attachment>?,
    val parentsStack: List<Int>?,
    val thread: Thread?
) {


}

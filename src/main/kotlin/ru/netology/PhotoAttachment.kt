package ru.netology

data class PhotoAttachment(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    val sizes: List<Sizes>,
    val width: Int?,
    val height: Int?,

) : SpecificAttachment {

}

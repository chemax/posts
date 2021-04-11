package ru.netology

data class LinkAttachment(
    val url: String,
    val title: String,
    val caption: String,
    val description: String,
    val photo: PhotoAttachment,
    val product: Product?,
    val button: ButtonFromLink?,
    val previewPage: String,
    val previewUrl: String
): SpecificAttachment {

}

package ru.netology

data class WikiPage(override val type: String, override val attach: WikiAttachment) : Attachment {
}
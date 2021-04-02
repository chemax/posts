package ru.netology

data class WikiPage(override val type: String = "wikiPage", val wikiPage: WikiAttachment) : Attachment {
}
package ru.netology

data class Link(override val type: String = "link", val link: LinkAttachment) : Attachment {
}
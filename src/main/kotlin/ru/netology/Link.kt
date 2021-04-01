package ru.netology

data class Link(override val type: String, override val attach: LinkAttachment) : Attachment {
}
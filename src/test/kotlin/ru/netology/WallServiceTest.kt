package ru.netology

import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    private val basePost = Post(
        0,
        0,
        0,
        0,
        0,
        "enot the raccoon",
        0,
        0,
        false,
        null,
        Copyright(0, "http://enot", "enot", "enot"),
        Likes(10, false, true, true),
        Reposts(2, false),
        Views(500),
        "test",
        0,
        donut = null,
        attachments = null
    )

    @org.junit.Test
    fun add() {
        val post = WallService.add(basePost)
        assertNotEquals(0, post.id)
    }

    @org.junit.Test
    fun updateSuccessfully() {
        val updatedPost = WallService.add(basePost)
        updatedPost.text = "44444"
        val result = WallService.update(updatedPost)
        println(result)
        assert(result)
    }

    @org.junit.Test
    fun updateUnsuccessfully() {
        val updatedPost = basePost
        updatedPost.id = 0
        updatedPost.text = "44444"
        assert(!WallService.update(updatedPost))
    }

    @org.junit.Test
    fun addCommentTest() {
        val comment = Comment(
            1,
            1,
            55,
            0,
            "sample text",
            null,
            null,
            null,
            null,
            null,
            null
        )
        WallService.createComment(comment)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val comment = Comment(
            1,
            2,
            55,
            0,
            "sample text",
            null,
            null,
            null,
            null,
            null,
            null
        )
        WallService.createComment(comment)
    }
}
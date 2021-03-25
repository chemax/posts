package ru.netology

import org.junit.Assert.*

class WallServiceTest {

    val basePost = Post(
        0,
        0,
        0,
        0,
        0,
        "enot the raccoon",
        0,
        0,
        false,
        Comments(),
        Copyright(0, "http://enot", "enot", "enot"),
        Likes(10, false, true, true),
        Reposts(2, false),
        Views(500),
        "test",
        0,
        donut = null
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
}
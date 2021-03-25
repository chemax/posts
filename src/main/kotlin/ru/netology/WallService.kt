package ru.netology

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        if (posts.isNotEmpty()) {
            post.id = posts.last().id + 1
        } else {

            post.id = 1
        }
        posts += post
        return post
    }

    fun update(newPost: Post): Boolean {
        var editIndex: Int? = null
        posts.forEachIndexed { index, post ->
            if (post.id == newPost.id) {
                editIndex = index
            }
        }
        if (editIndex != null) {
            val postForWrite = newPost.copy(
                id = posts[editIndex!!].id,
                ownerId = posts[editIndex!!].ownerId,
                date = posts[editIndex!!].date
            )
            posts[editIndex!!] = postForWrite
            return true
        }
        return false
    }
}
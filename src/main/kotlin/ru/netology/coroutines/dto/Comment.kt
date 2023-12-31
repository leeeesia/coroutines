package ru.netology.coroutines.dto

data class Comment(
    val id: Long,
    val authorId: Long,
    val postId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)

data class CommentFull(
    val comment: Comment,
    val author: Author? = null
)

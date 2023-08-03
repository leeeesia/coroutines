package ru.netology.coroutines.dto

data class Post(
    val id: Long,
    val authorId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)

data class PostFull(
    val post: Post,
    val author: Author? = null,
    val comments: List<CommentFull>? = null
)

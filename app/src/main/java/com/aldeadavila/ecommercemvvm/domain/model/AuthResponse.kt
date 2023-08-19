package com.aldeadavila.ecommercemvvm.domain.model

data class AuthResponse(
    val user: User,
    val token: String
)
